package com.personalproject.core.models.impl;

import com.day.cq.commons.date.DateUtil;
import com.personalproject.core.config.SchedulerConfiguration;
import com.personalproject.core.models.DisplayDate;
import com.personalproject.core.utils.ResolverUtil;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.jcr.Node;
import javax.jcr.Session;
import java.util.Calendar;
@Component(service = DisplayDate.class,immediate = true)
@Designate(ocd= SchedulerConfiguration.class)
public class DisplayDateImpl implements DisplayDate {
    private static final Logger LOG = LoggerFactory.getLogger(DisplayDateImpl.class);
    @Reference
    ResourceResolverFactory resourceResolverFactory;
    @Override
    public String displayDate(String path) {
        try(ResourceResolver serviceResourceResolver = ResolverUtil.newResolver(resourceResolverFactory)) {
            Session session = serviceResourceResolver.adaptTo(Session.class);
            Resource resource = serviceResourceResolver.getResource(path);
            if (resource != null) {
                Node node = resource.adaptTo(Node.class);
                if(node != null) {
                    node.setProperty("DateTime", "Date and time added");
                    node.setProperty("NewTime", DateUtil.parseISO8601(DateUtil.getISO8601Date(Calendar.getInstance())));
                    if (session != null){
                        session.save();
                        session.logout();
                    }
                }
            }
        } catch (Exception e) {
            LOG.info(e.getMessage());
        }
        return path;
    }
}