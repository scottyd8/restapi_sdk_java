//
//

package SNET.Core;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.commons.lang.StringUtils;

public class HttpConnection {
	private Dictionary<String, String> config = new Hashtable<String, String>();

	public HttpConnection(Dictionary<String, String> config) throws Exception {
		this.config = config;
	}

	public String execute(String payLoad, HttpURLConnection connection)
			throws Exception {
		if (!StringUtils.isBlank(payLoad)) {
			String _dummyScrutVar0 = connection.getRequestMethod();
			if (_dummyScrutVar0.equals("POST")
					|| _dummyScrutVar0.equals("PUT")
					|| _dummyScrutVar0.equals("DELETE")) {

				DataOutputStream wr = new DataOutputStream(
						connection.getOutputStream());
				try {
					{
						if (!StringUtils.isBlank(payLoad)) {
							wr.writeBytes(payLoad);
							wr.flush();
						}
					}
				} finally {
					if (wr != null)
						wr.close();

				}
			}

		}

		BufferedReader in = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));

		try {
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			return response.toString();
		} finally {
			in.close();

		}
	}

}
