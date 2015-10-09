//
//

package SNET.Core;

import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.commons.lang.StringUtils;
import org.omg.CORBA.Environment;

public class UserAgentHeader {
	private static String dotNetHeader = UserAgentHeader
			.getDotNetVersionHeader();
	private static String osHeader = UserAgentHeader.getOSHeader();
	private String developerId = new String();
	private String developerVersion = new String();

	private static String getDotNetVersionHeader() {
		return "language=DOTNET;v="
				+ System.getProperty("os.version").trim();
	}

	static {
		try {
		} catch (Exception _dummyStaticConstructorCatchVar0) {
			throw new ExceptionInInitializerError(
					_dummyStaticConstructorCatchVar0);
		}

	}

	public UserAgentHeader(String developerId, String developerVersion)
			throws Exception {
		this.developerId = StringUtils.isBlank(developerId) ? "" : developerId;
		this.developerVersion = StringUtils.isBlank(developerVersion) ? ""
				: developerVersion;
	}

	public Dictionary<String, String> getHeader() throws Exception {
		Dictionary<String, String> header = new Hashtable<String, String>();
		header.put("developerId", this.developerId);
		header.put("developerVersion", this.developerVersion);
		return header;
	}

	private String formUserAgentHeader() {
		StringBuilder stringBuilder = new StringBuilder("SecureNetRestApiSDK/"
				+ this.developerId + "/" + this.developerVersion + " ");
		stringBuilder.append(";").append(UserAgentHeader.dotNetHeader);
		if (!StringUtils.isBlank(UserAgentHeader.osHeader))
			stringBuilder.append(";").append(UserAgentHeader.osHeader);

		return ((Object) stringBuilder).toString();
	}

	private static String getOSHeader() {
		String str1 = "";
		String str2 = "";
		if ("64".equals(System.getProperty("sun.arch.data.model")))
			str2 = (new Object[] { (Object) str1, (Object) "bit=", (Object) 64,
					(Object) ";" }).toString();
		else if("32".equals(System.getProperty("sun.arch.data.model")))
			str2 = (new Object[] { (Object) str1, (Object) "bit=", (Object) 32,
					(Object) ";" }).toString();
		return str2 + (Object) "os=" + System.getProperty("os.version")
				+ ";";
	}

}
