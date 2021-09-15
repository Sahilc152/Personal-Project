package com.personalproject.core.models.Impl;

import com.personalproject.core.models.Brands;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Brands.class,
        //resourceType = HomeBannerImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class BrandsImpl implements Brands {
    private static final Logger LOG = LoggerFactory.getLogger(BrandsImpl.class);
    //final protected static String RESOURCE_TYPE="personalproject/components/content/brands";

    @ValueMapValue
    List<String> path;

    @Override
    public List<String> getPath() {
        if(path!=null){
            return new ArrayList<String>(path);
        }else{
            return Collections.emptyList();
        }
    }
}
