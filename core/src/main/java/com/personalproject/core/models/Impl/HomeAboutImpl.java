package com.personalproject.core.models.Impl;

import com.personalproject.core.models.HomeAbout;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = HomeAbout.class,
        //resourceType = HomeAboutImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeAboutImpl implements HomeAbout {
    private static final Logger LOG = LoggerFactory.getLogger(HomeAboutImpl.class);
    //final protected static String RESOURCE_TYPE="personalproject/components/content/homeabout";

    @ValueMapValue
    private String about;

    @ValueMapValue
    private String details;

    @ValueMapValue
    private String intro;

    @ValueMapValue
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
    public String getButton() {
        return mybutton;
    }

    @Override
    public String getImage() {
        return img;
    }
}
