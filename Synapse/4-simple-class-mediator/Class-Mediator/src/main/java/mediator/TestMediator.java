package mediator;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNode;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import javax.xml.namespace.QName;

import java.util.Iterator;
import javax.xml.stream.XMLStreamException;

/**
 * Created by chanaka on 2/28/18.
 */
public class TestMediator extends AbstractMediator {


    private static final Log log = LogFactory.getLog(TestMediator.class);

    public TestMediator(){}

    @Override
    public boolean mediate(MessageContext mc) {
// =
  //              (org.apache.axis2.context.MessageContext) mc;
        String newJsonPayload = "Hello world";

        mc.setProperty("sample",newJsonPayload);

        return true;
    }

    public String getType() {
        return null;
    }

    public void setTraceState(int traceState) {
        traceState = 0;
    }

    public int getTraceState() {
        return 0;
    }
}
