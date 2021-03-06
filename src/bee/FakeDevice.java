package bee;

import bee.generated.server.*;

import javax.jws.WebService;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.util.List;

@WebService
public class FakeDevice implements Device
{

    @Override
    public List<Service> getServices(boolean includeCapability)
    {
        return null;
    }

    @Override
    public DeviceServiceCapabilities getServiceCapabilities()
    {
        return null;
    }

    @Override
    public void getDeviceInformation(Holder<String> manufacturer, Holder<String> model, Holder<String> firmwareVersion, Holder<String> serialNumber, Holder<String> hardwareId)
    {

    }

    @Override
    public void setSystemDateAndTime(SetDateTimeType dateTimeType, boolean daylightSavings, TimeZone timeZone, DateTime utcDateTime)
    {

    }

    @Override
    public SystemDateTime getSystemDateAndTime()
    {
        return null;
    }

    @Override
    public void setSystemFactoryDefault(FactoryDefaultType factoryDefault)
    {

    }

    @Override
    public String upgradeSystemFirmware(AttachmentData firmware)
    {
        return null;
    }

    @Override
    public String systemReboot()
    {
        return null;
    }

    @Override
    public void restoreSystem(List<BackupFile> backupFiles)
    {

    }

    @Override
    public List<BackupFile> getSystemBackup()
    {
        return null;
    }

    @Override
    public SystemLog getSystemLog(SystemLogType logType)
    {
        return null;
    }

    @Override
    public SupportInformation getSystemSupportInformation()
    {
        return null;
    }

    @Override
    public List<Scope> getScopes()
    {
        return null;
    }

    @Override
    public void setScopes(List<String> scopes)
    {

    }

    @Override
    public void addScopes(List<String> scopeItem)
    {

    }

    @Override
    public void removeScopes(Holder<List<String>> scopeItem)
    {

    }

    @Override
    public DiscoveryMode getDiscoveryMode()
    {
        return null;
    }

    @Override
    public void setDiscoveryMode(DiscoveryMode discoveryMode)
    {

    }

    @Override
    public DiscoveryMode getRemoteDiscoveryMode()
    {
        return null;
    }

    @Override
    public void setRemoteDiscoveryMode(DiscoveryMode remoteDiscoveryMode)
    {

    }

    @Override
    public List<NetworkHost> getDPAddresses()
    {
        return null;
    }

    @Override
    public GetEndpointReferenceResponse getEndpointReference(GetEndpointReference parameters)
    {
        return null;
    }

    @Override
    public RemoteUser getRemoteUser()
    {
        return null;
    }

    @Override
    public void setRemoteUser(RemoteUser remoteUser)
    {

    }

    @Override
    public List<User> getUsers()
    {
        return null;
    }

    @Override
    public void createUsers(List<User> user)
    {

    }

    @Override
    public void deleteUsers(List<String> username)
    {

    }

    @Override
    public void setUser(List<User> user)
    {

    }

    @Override
    public String getWsdlUrl()
    {
        return null;
    }

    @Override
    public Capabilities getCapabilities(List<CapabilityCategory> category)
    {
        System.out.println("FakeDevice.getCapabilities");
        return new Capabilities();
    }

    @Override
    public void setDPAddresses(List<NetworkHost> dpAddress)
    {

    }

    @Override
    public HostnameInformation getHostname()
    {
        return null;
    }

    @Override
    public void setHostname(String name)
    {

    }

    @Override
    public boolean setHostnameFromDHCP(boolean fromDHCP)
    {
        return false;
    }

    @Override
    public DNSInformation getDNS()
    {
        return null;
    }

    @Override
    public void setDNS(boolean fromDHCP, List<String> searchDomain, List<IPAddress> dnsManual)
    {

    }

    @Override
    public NTPInformation getNTP()
    {
        return null;
    }

    @Override
    public void setNTP(boolean fromDHCP, List<NetworkHost> ntpManual)
    {

    }

    @Override
    public DynamicDNSInformation getDynamicDNS()
    {
        return null;
    }

    @Override
    public void setDynamicDNS(DynamicDNSType type, String name, Duration ttl)
    {

    }

    @Override
    public List<NetworkInterface> getNetworkInterfaces()
    {
        return null;
    }

    @Override
    public boolean setNetworkInterfaces(String interfaceToken, NetworkInterfaceSetConfiguration networkInterface)
    {
        return false;
    }

    @Override
    public List<NetworkProtocol> getNetworkProtocols()
    {
        return null;
    }

    @Override
    public void setNetworkProtocols(List<NetworkProtocol> networkProtocols)
    {

    }

    @Override
    public NetworkGateway getNetworkDefaultGateway()
    {
        return null;
    }

    @Override
    public void setNetworkDefaultGateway(List<String> iPv4Address, List<String> iPv6Address)
    {

    }

    @Override
    public NetworkZeroConfiguration getZeroConfiguration()
    {
        return null;
    }

    @Override
    public void setZeroConfiguration(String interfaceToken, boolean enabled)
    {

    }

    @Override
    public IPAddressFilter getIPAddressFilter()
    {
        return null;
    }

    @Override
    public void setIPAddressFilter(IPAddressFilter ipAddressFilter)
    {

    }

    @Override
    public void addIPAddressFilter(IPAddressFilter ipAddressFilter)
    {

    }

    @Override
    public void removeIPAddressFilter(IPAddressFilter ipAddressFilter)
    {

    }

    @Override
    public BinaryData getAccessPolicy()
    {
        return null;
    }

    @Override
    public void setAccessPolicy(BinaryData policyFile)
    {

    }

    @Override
    public Certificate createCertificate(String certificateID, String subject, XMLGregorianCalendar validNotBefore, XMLGregorianCalendar validNotAfter)
    {
        return null;
    }

    @Override
    public List<Certificate> getCertificates()
    {
        return null;
    }

    @Override
    public List<CertificateStatus> getCertificatesStatus()
    {
        return null;
    }

    @Override
    public void setCertificatesStatus(List<CertificateStatus> certificateStatus)
    {

    }

    @Override
    public void deleteCertificates(List<String> certificateID)
    {

    }

    @Override
    public BinaryData getPkcs10Request(String certificateID, String subject, BinaryData attributes)
    {
        return null;
    }

    @Override
    public void loadCertificates(List<Certificate> nvtCertificate)
    {

    }

    @Override
    public boolean getClientCertificateMode()
    {
        return false;
    }

    @Override
    public void setClientCertificateMode(boolean enabled)
    {

    }

    @Override
    public List<RelayOutput> getRelayOutputs()
    {
        return null;
    }

    @Override
    public void setRelayOutputSettings(String relayOutputToken, RelayOutputSettings properties)
    {

    }

    @Override
    public void setRelayOutputState(String relayOutputToken, RelayLogicalState logicalState)
    {

    }

    @Override
    public String sendAuxiliaryCommand(String auxiliaryCommand)
    {
        return null;
    }

    @Override
    public List<Certificate> getCACertificates()
    {
        return null;
    }

    @Override
    public void loadCertificateWithPrivateKey(List<CertificateWithPrivateKey> certificateWithPrivateKey)
    {

    }

    @Override
    public CertificateInformation getCertificateInformation(String certificateID)
    {
        return null;
    }

    @Override
    public void loadCACertificates(List<Certificate> caCertificate)
    {

    }

    @Override
    public void createDot1XConfiguration(Dot1XConfiguration dot1XConfiguration)
    {

    }

    @Override
    public void setDot1XConfiguration(Dot1XConfiguration dot1XConfiguration)
    {

    }

    @Override
    public Dot1XConfiguration getDot1XConfiguration(String dot1XConfigurationToken)
    {
        return null;
    }

    @Override
    public List<Dot1XConfiguration> getDot1XConfigurations()
    {
        return null;
    }

    @Override
    public void deleteDot1XConfiguration(List<String> dot1XConfigurationToken)
    {

    }

    @Override
    public GetDot11CapabilitiesResponse getDot11Capabilities(GetDot11Capabilities parameters)
    {
        return null;
    }

    @Override
    public Dot11Status getDot11Status(String interfaceToken)
    {
        return null;
    }

    @Override
    public List<Dot11AvailableNetworks> scanAvailableDot11Networks(String interfaceToken)
    {
        return null;
    }

    @Override
    public void getSystemUris(Holder<SystemLogUriList> systemLogUris, Holder<String> supportInfoUri, Holder<String> systemBackupUri, Holder<GetSystemUrisResponse.Extension> extension)
    {

    }

    @Override
    public void startFirmwareUpgrade(Holder<String> uploadUri, Holder<Duration> uploadDelay, Holder<Duration> expectedDownTime)
    {

    }

    @Override
    public void startSystemRestore(Holder<String> uploadUri, Holder<Duration> expectedDownTime)
    {

    }

    @Override
    public List<StorageConfiguration> getStorageConfigurations()
    {
        return null;
    }

    @Override
    public String createStorageConfiguration(StorageConfigurationData storageConfiguration)
    {
        return null;
    }

    @Override
    public StorageConfiguration getStorageConfiguration(String token)
    {
        return null;
    }

    @Override
    public void setStorageConfiguration(StorageConfiguration storageConfiguration)
    {

    }

    @Override
    public void deleteStorageConfiguration(String token)
    {

    }

    @Override
    public List<LocationEntity> getGeoLocation()
    {
        return null;
    }

    @Override
    public void setGeoLocation(List<LocationEntity> location)
    {

    }

    @Override
    public void deleteGeoLocation(List<LocationEntity> location)
    {

    }
}
