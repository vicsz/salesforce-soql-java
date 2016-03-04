import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

public class Soql {

    private final static String AUTHENTICATION_END_POINT = "https://login.salesforce.com/services/Soap/u/35.0/";
    private PartnerConnection connection;

    public Soql(String username, String password) throws ConnectionException {
        ConnectorConfig config = new ConnectorConfig();
        config.setUsername(username);
        config.setPassword(password);
        config.setAuthEndpoint(AUTHENTICATION_END_POINT);

        connection = Connector.newConnection(config);
    }

    public SObject[] executeQuery(String soql) throws ConnectionException {
        return connection.query(soql).getRecords();
    }
}
