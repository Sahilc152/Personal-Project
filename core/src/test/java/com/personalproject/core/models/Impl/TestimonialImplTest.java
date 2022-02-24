package com.personalproject.core.models.Impl;

import com.personalproject.core.models.Testimonial;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith({AemContextExtension.class, MockitoExtension.class})

class TestimonialImplTest {

    private final AemContext aemContext=new AemContext();
    private Testimonial testimonial;

    @BeforeEach
    void setUp() {
        aemContext.addModelsForClasses(TestimonialImpl.class);
        aemContext.load().json("/com/personalproject/core/models/Testimonial.json","/component");
    }

    @Test
    void getTestimonialDetails() {
        aemContext.currentResource("/component/testimonial");
        testimonial = aemContext.request().adaptTo(Testimonial.class);
        assertEquals("Do you want to be even more successful? Learn to love learning and growth. The more effort you put into improving your skills, the bigger the payoff you.", testimonial.getTestimonialDetails().get(0).get("description"));
        assertEquals("Harriet Maxwell", testimonial.getTestimonialDetails().get(0).get("title"));
        assertEquals("CEO at Google", testimonial.getTestimonialDetails().get(0).get("heading"));

        assertEquals(
                "A purpose is the eternal condition for success. Every former smoker can tell you just how hard it is to stop smoking cigarettes. However.", testimonial.getTestimonialDetails().get(1).get("description"));
        assertEquals("Carolyn Craig", testimonial.getTestimonialDetails().get(1).get("title"));
        assertEquals("CEO at Facebook", testimonial.getTestimonialDetails().get(1).get("heading"));
    }
}