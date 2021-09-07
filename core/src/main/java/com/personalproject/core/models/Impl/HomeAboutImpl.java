package com.personalproject.core.models.Impl;

import com.personalproject.core.models.HomeAbout;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = HomeAbout.class,
        resourceType = HomeAboutImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeAboutImpl implements HomeAbout {
    private static final Logger LOG = LoggerFactory.getLogger(HomeAboutImpl.class);
    final protected static String RESOURCE_TYPE="personalproject/components/content/homeabout";

    @ValueMapValue
    @Default(values = "ABOUT ME")
    private String about;

    @ValueMapValue
    @Default(values = "PERSONAL DETAILS")
    private String details;

    @ValueMapValue
    @Default(values = "Here, I focus on a range of items and features that we use in life without giving them a second thought. such as Coca Cola. Dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.")
    private String intro;

    @ValueMapValue
    @Default(values = "VIEW FULL DETAILS")
    private String mybutton;

    @ValueMapValue
    private String img;

    @Override
    public String getAbout() {
        return about;
    }

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public String getIntro() {
        return intro;
    }

    @Override
    public String getMyButton() {
        return mybutton;
    }

    @Override
    public String getAboutImage() {
        return img;
    }
}
