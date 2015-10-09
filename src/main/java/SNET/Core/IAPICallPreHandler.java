//
//

package SNET.Core;

import java.util.Dictionary;


public interface IAPICallPreHandler   
{
    Dictionary<String, String> getHeaderMap() throws Exception ;

    String getPayload() throws Exception ;

    String getEndpoint() throws Exception ;

}


