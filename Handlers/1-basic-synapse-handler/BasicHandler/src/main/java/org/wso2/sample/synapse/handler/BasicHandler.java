package org.wso2.sample.synapse.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.AbstractSynapseHandler;
import org.apache.synapse.MessageContext;

/**
 * This is a sample handler that log for all message flows.
 */
public class BasicHandler
        extends AbstractSynapseHandler
{
    private static final Log log = LogFactory.getLog(BasicHandler.class);

    // Handle incoming message flow to the EI server
    public boolean handleRequestInFlow(MessageContext messageContext)
    {
        log.info("Inside Request Inflow");
        return true;
    }

    public boolean handleRequestOutFlow(MessageContext messageContext)
    {
        log.info("Inside Request Outflow");
        return true;
    }

    public boolean handleResponseInFlow(MessageContext messageContext)
    {
        log.info("Inside Response Inflow");
        return true;
    }

    public boolean handleResponseOutFlow(MessageContext messageContext)
    {
        log.info("Inside Response Outflow");
        return true;
    }
}
