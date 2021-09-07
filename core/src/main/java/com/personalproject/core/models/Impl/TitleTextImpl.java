package com.personalproject.core.models.Impl;

import com.personalproject.core.models.TitleText;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = TitleText.class,
        resourceType = TitleTextImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TitleTextImpl implements TitleText {
    private static final Logger LOG = LoggerFactory.getLogger(TitleTextImpl.class);
    final protected static String RESOURCE_TYPE="personalproject/components/content/titletext";

    @ValueMapValue
    @Default(values = "")
    private String title;

    @ValueMapValue
    @Default(values = "")
    private String info;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getInfo() {
        return info;
    }
}
