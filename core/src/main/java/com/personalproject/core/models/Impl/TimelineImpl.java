package com.personalproject.core.models.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personalproject.core.models.Timeline;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = Timeline.class,
        resourceType = TimelineImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson",extensions = "json",selector ="personal")
public class TimelineImpl implements Timeline {
    private static final Logger LOG = LoggerFactory.getLogger(TimelineImpl.class);
    protected static final String RESOURCE_TYPE="personalproject/components/content/timeline";

    @ChildResource
    Resource timelinedetailswithmap;

    @JsonProperty(value = "Details - Timeline")
    @Override
    public List<Map<String, String>> getTimelineDetailsWithMap() {
        List<Map<String, String>> timelineDetailsMap=new ArrayList<>();
        try {
            if(timelinedetailswithmap!=null){
                for (Resource timeline : timelinedetailswithmap.getChildren()) {
                    Map<String,String> timelineMap=new HashMap<>();
                    timelineMap.put("heading",timeline.getValueMap().get("heading",String.class));
                    timelineMap.put("title",timeline.getValueMap().get("title",String.class));
                    timelineMap.put("text",timeline.getValueMap().get("text",String.class));
                    timelineMap.put("left",timeline.getValueMap().get("left",String.class));
                    timelineDetailsMap.add(timelineMap);
                }
            }
        }catch (Exception e){
            LOG.info("\n ERROR while getting Book Details {} ",e.getMessage());
        }
        LOG.info("\n SIZE {} ",timelineDetailsMap.size());
        return timelineDetailsMap;
    }
}
