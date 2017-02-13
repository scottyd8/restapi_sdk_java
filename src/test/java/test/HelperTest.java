package test;

import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HelperTest {
    private Boolean _isSoftDescriptorEnabled ;
    private Boolean _isDynamicMCCEnabled ;
    private String SoftDescriptorValue = "Valid Soft Descriptor";
    private String DynamicMCCValue = "2047";
    private Properties config ;
    private String _requestSoftDescriptor;
    private String _responseSoftDescriptor;
    private String _requestDynamicMCC;
    private String _responseDynamicMCC;

    public HelperTest() throws IOException {
        InputStream stream  = this.getClass().getResourceAsStream("/config.properties");
        config = new Properties();
        config.load(stream);
        _isSoftDescriptorEnabled = Boolean.parseBoolean(config.getProperty("isSoftDescriptorEnabled"));
        _requestSoftDescriptor = _isSoftDescriptorEnabled ? SoftDescriptorValue : null;
        _responseSoftDescriptor = _isSoftDescriptorEnabled ? SoftDescriptorValue : "";
        _isDynamicMCCEnabled = Boolean.parseBoolean(config.getProperty("isDynamicMCCEnabled"));
        _requestDynamicMCC = _isDynamicMCCEnabled ? DynamicMCCValue : null;
        _responseDynamicMCC = _isDynamicMCCEnabled ? DynamicMCCValue : "";
    }

    public String getRequestSoftDescriptor()
    {
        return _requestSoftDescriptor;
    }

    public String getResponseSoftDescriptor()
    {
        return _responseSoftDescriptor;
    }

    public String getRequestDynamicMCC()
    {
        return _requestDynamicMCC;
    }

    public String getResponseDynamicMCC()
    {
        return _responseDynamicMCC;
    }
}