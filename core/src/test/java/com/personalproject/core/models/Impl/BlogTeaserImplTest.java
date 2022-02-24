package com.personalproject.core.models.Impl;

import com.personalproject.core.models.BlogTeaser;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith({AemContextExtension.class, MockitoExtension.class})

class BlogTeaserImplTest {

    private final AemContext aemContext=new AemContext();
    private BlogTeaser blogTeaser;
    @BeforeEach
    void setUp() {
        aemContext.addModelsForClasses(BlogTeaserImpl.class);
        aemContext.load().json("/com/personalproject/core/models/BlogTeaser.json","/component");
    }

    @Test
    void getImage() {
        aemContext.currentResource("/component/blogTeaser");
        BlogTeaser blogTeaser = aemContext.request().adaptTo(BlogTeaser.class);
        final String expected="/content/dam/personalproject/b1.jpg";
        String actual = blogTeaser.getImage();
        assertEquals(expected,actual);
    }

    @Test
    void getTitle() {
        aemContext.currentResource("/component/blogTeaser");
        BlogTeaser blogTeaser = aemContext.request().adaptTo(BlogTeaser.class);
        final String expected="BREAK THROUGH SELF DOUBT AND FEAR";
        String actual = blogTeaser.getTitle();
        assertEquals(expected,actual);
    }

    @Test
    void getDescription() {
        aemContext.currentResource("/component/blogTeaser");
        BlogTeaser blogTeaser = aemContext.request().adaptTo(BlogTeaser.class);
        final String expected="Dream interpretation has many forms; it can be done be done for the sake of fun, hobby or can be taken up as a serious career.";
        String actual = blogTeaser.getDescription();
        assertEquals(expected,actual);
    }
}