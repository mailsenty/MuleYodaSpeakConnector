
package org.mule.modules.yodaspeak.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.yodaspeak.YodaSpeakConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>YodaSpeakConnectorProcessAdapter</code> is a wrapper around {@link YodaSpeakConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-01T12:47:14-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class YodaSpeakConnectorProcessAdapter
    extends YodaSpeakConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<YodaSpeakConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, YodaSpeakConnectorCapabilitiesAdapter> getProcessTemplate() {
        final YodaSpeakConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,YodaSpeakConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, YodaSpeakConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, YodaSpeakConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
