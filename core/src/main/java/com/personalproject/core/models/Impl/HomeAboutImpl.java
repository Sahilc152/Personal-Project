package com.personalproject.core.models.Impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personalproject.core.models.HomeAbout;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = HomeAbout.class,
        resourceType = HomeAboutImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson",extensions = "json",selector ="personal")
public class HomeAboutImpl implements HomeAbout {
    private static final Logger LOG = LoggerFactory.getLogger(HomeAboutImpl.class);
    final protected static String RESOURCE_TYPE="personalproject/components/content/homeabout";

    @ValueMapValue
    private String about;

    @ValueMapValue
    private String details;

    @ValueMapValue
    private String intro;

    @ValueMapValue
    private String mybutton;

    @ValueMapValue
    private String path;

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

    @JsonProperty(value = "Title")
    @Override
    public String getMyButton() {
        return mybutton;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getAboutImage() {
        return img;
    }

    @JsonProperty(value = "homeabout-details")
    public String details() {
        return "DETAILS:";
    }
}
