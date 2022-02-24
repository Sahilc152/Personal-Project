package com.personalproject.core.models.Impl;

import com.personalproject.core.models.HomeAbout;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith({AemContextExtension.class, MockitoExtension.class})

class HomeAboutImplTest {

    private final AemContext aemContext=new AemContext();
    private HomeAbout homeAbout;

    @BeforeEach
    void setUp() {
        aemContext.addModelsForClasses(HomeAboutImpl.class);
        aemContext.load().json("/com/personalproject/core/models/HomeAbout.json","/component");
    }

    @Test
    void getAbout() {
        aemContext.currentResource("/component/homeAbout");
        HomeAbout homeAbout = aemContext.request().adaptTo(HomeAbout.class);
        final String expected="About Me";
        String actual = homeAbout.getAbout();
        assertEquals(expected,actual);
    }

    @Test
    void getDetails() {
        aemContext.currentResource("/component/homeAbout");
        HomeAbout homeAbout = aemContext.request().adaptTo(HomeAbout.class);
        final String expected="Personal Details";
        String actual = homeAbout.getDetails();
        assertEquals(expected,actual);
    }

    @Test
    void getIntro() {
        aemContext.currentResource("/component/homeAbout");
        HomeAbout homeAbout = aemContext.request().adaptTo(HomeAbout.class);
        final String expected="Here, I focus on a range of items and features that we use in life without giving them a second thought. such as Coca Cola. Dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.";
        String actual = homeAbout.getIntro();
        assertEquals(expected,actual);
    }

    @Test
    void getMyButton() {
        aemContext.currentResource("/component/homeAbout");
        HomeAbout homeAbout = aemContext.request().adaptTo(HomeAbout.class);
        final String expected="View full details";
        String actual = homeAbout.getMyButton();
        assertEquals(expected,actual);
    }

    @Test
    void getPath() {
        aemContext.currentResource("/component/homeAbout");
        HomeAbout homeAbout = aemContext.request().adaptTo(HomeAbout.class);
        final String expected="/content/personalproject/us/en/about";
        String actual = homeAbout.getPath();
        assertEquals(expected,actual);
    }

    @Test
    void getAboutImage() {
        aemContext.currentResource("/component/homeAbout");
        HomeAbout homeAbout = aemContext.request().adaptTo(HomeAbout.class);
        final String expected="/content/dam/personalproject/about-img.png";
        String actual = homeAbout.getAboutImage();
        assertEquals(expected,actual);
    }
}