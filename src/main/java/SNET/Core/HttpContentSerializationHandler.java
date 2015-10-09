//
//

package SNET.Core;


public class HttpContentSerializationHandler  
//extends DelegatingHandler 
{
   /* public HttpContentSerializationHandler() throws Exception {
    }

    public HttpContentSerializationHandler(HttpMessageHandler innerHandler) throws Exception {
        super(innerHandler);
    }

    protected Task<HttpResponseMessage> sendAsync(HttpRequestMessage request, CancellationToken cancellationToken) throws Exception {
        request.Content = ConvertToStreamContent(request.Content);
        return super.SendAsync(request, cancellationToken).<HttpResponseMessage>ContinueWith( [UNSUPPORTED] to translate lambda expressions we need an explicit delegate type, try adding a cast "(responseTask) => {
            HttpResponseMessage response = responseTask.Result;
            response.Content = ConvertToStreamContent(response.Content);
            return response;
        }" );
    }

    private StreamContent convertToStreamContent(HttpContent originalContent) throws Exception {
        if (originalContent == null)
        {
            return null;
        }
         
        StreamContent streamContent = originalContent instanceof StreamContent ? (StreamContent)originalContent : (StreamContent)null;
        if (streamContent != null)
        {
            return streamContent;
        }
         
        MemoryStream ms = new MemoryStream();
        originalContent.CopyToAsync(ms).Wait();
        ms.Position = 0;
        streamContent = new StreamContent(ms);
        for (Object _dummyForeachVar0 : originalContent.Headers)
        {
            KeyValuePair<String, IEnumerable<String>> header = (KeyValuePair<String, IEnumerable<String>>)_dummyForeachVar0;
            streamContent.Headers.TryAddWithoutValidation(header.Key, header.Value);
        }
        return streamContent;
    }*/

}


