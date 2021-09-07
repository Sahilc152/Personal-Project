package com.personalproject.core.models.Impl;

import com.personalproject.core.models.HomeBanner;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = HomeBanner.class,
        resourceType = HomeBannerImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeBannerImpl implements HomeBanner {
    private static final Logger LOG = LoggerFactory.getLogger(HomeBannerImpl.class);
    final protected static String RESOURCE_TYPE="personalproject/components/content/homebanner";

    @ValueMapValue
    @Default(values = "THIS IS ME")
    private String bio;

    @ValueMapValue
    @Default(values = "PHILIP GILBERT")
    private String fullname;

    @ValueMapValue
    @Default(values = "You will begin to realise why this exercise is called the Dickens Pattern with reference to the ghost showing Scrooge some different futures.")
    private String intro;

    @ValueMapValue
    @Default(values = "DISCOVER NOW")
    private String mybutton;

    @ValueMapValue
    private String img;

    @Override
    public String getBio() {
        return bio;
    }

    @Override
    public String getFullName() {
        return fullname;
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
    public String getHeroImage() {
        return img;
    }
}
