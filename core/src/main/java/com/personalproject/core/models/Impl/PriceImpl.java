package com.personalproject.core.models.Impl;

import com.personalproject.core.models.Price;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Price.class,
        //resourceType = TitleTextImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class PriceImpl implements Price {
    private static final Logger LOG = LoggerFactory.getLogger(TitleTextImpl.class);
    //final protected static String RESOURCE_TYPE="personalproject/components/content/price";

    @ValueMapValue
    private String number;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String heading;

    @ValueMapValue
    private String tag1;

    @ValueMapValue
    private String tag2;

    @ValueMapValue
    private String tag3;

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getTag1() {
        return tag1;
    }

    @Override
    public String getTag2() {
        return tag2;
    }

    @Override
    public String getTag3() {
        return tag3;
    }
}
