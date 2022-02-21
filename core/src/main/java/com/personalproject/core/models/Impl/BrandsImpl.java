package com.personalproject.core.models.impl;

import com.personalproject.core.models.Brands;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Brands.class,
        //resourceType = HomeBannerImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class BrandsImpl implements Brands {

    @ValueMapValue
    List<String> path;

    @Override
    public List<String> getPath() {
        if(path!=null){
            return new ArrayList<>(path);
        }else{
            return Collections.emptyList();
        }
    }
}
