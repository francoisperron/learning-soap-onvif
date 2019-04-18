
package bee.generated.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.wsaddressing.W3CEndpointReference;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bee.generated.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDot11Capabilities_QNAME = new QName("http://bee/", "getDot11Capabilities");
    private final static QName _UnableToDestroySubscriptionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroySubscriptionFault");
    private final static QName _Include_QNAME = new QName("http://www.w3.org/2004/08/xop/include", "Include");
    private final static QName _CreateStorageConfigurationResponse_QNAME = new QName("http://bee/", "createStorageConfigurationResponse");
    private final static QName _CreateDot1XConfiguration_QNAME = new QName("http://bee/", "createDot1XConfiguration");
    private final static QName _GetDot1XConfigurationResponse_QNAME = new QName("http://bee/", "getDot1XConfigurationResponse");
    private final static QName _SetIPAddressFilter_QNAME = new QName("http://bee/", "setIPAddressFilter");
    private final static QName _SetScopesResponse_QNAME = new QName("http://bee/", "setScopesResponse");
    private final static QName _InvalidProducerPropertiesExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidProducerPropertiesExpressionFault");
    private final static QName _ProducerReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ProducerReference");
    private final static QName _SetDiscoveryMode_QNAME = new QName("http://bee/", "setDiscoveryMode");
    private final static QName _GetNetworkProtocols_QNAME = new QName("http://bee/", "getNetworkProtocols");
    private final static QName _GetRemoteUserResponse_QNAME = new QName("http://bee/", "getRemoteUserResponse");
    private final static QName _LoadCACertificatesResponse_QNAME = new QName("http://bee/", "loadCACertificatesResponse");
    private final static QName _CreateStorageConfiguration_QNAME = new QName("http://bee/", "createStorageConfiguration");
    private final static QName _SetSystemFactoryDefaultResponse_QNAME = new QName("http://bee/", "setSystemFactoryDefaultResponse");
    private final static QName _UpgradeSystemFirmware_QNAME = new QName("http://bee/", "upgradeSystemFirmware");
    private final static QName _GetSystemUrisResponse_QNAME = new QName("http://bee/", "getSystemUrisResponse");
    private final static QName _SetNetworkInterfaces_QNAME = new QName("http://bee/", "setNetworkInterfaces");
    private final static QName _RestoreSystemResponse_QNAME = new QName("http://bee/", "restoreSystemResponse");
    private final static QName _SetHostname_QNAME = new QName("http://bee/", "setHostname");
    private final static QName _GetDNSResponse_QNAME = new QName("http://bee/", "getDNSResponse");
    private final static QName _GetRemoteDiscoveryMode_QNAME = new QName("http://bee/", "getRemoteDiscoveryMode");
    private final static QName _SetHostnameResponse_QNAME = new QName("http://bee/", "setHostnameResponse");
    private final static QName _SystemRebootResponse_QNAME = new QName("http://bee/", "systemRebootResponse");
    private final static QName _GetZeroConfiguration_QNAME = new QName("http://bee/", "getZeroConfiguration");
    private final static QName _CreationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "CreationTime");
    private final static QName _Envelope_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Envelope");
    private final static QName _From_QNAME = new QName("http://www.w3.org/2005/08/addressing", "From");
    private final static QName _LoadCertificatesResponse_QNAME = new QName("http://bee/", "loadCertificatesResponse");
    private final static QName _SetSystemFactoryDefault_QNAME = new QName("http://bee/", "setSystemFactoryDefault");
    private final static QName _UnacceptableTerminationTimeFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableTerminationTimeFault");
    private final static QName _Header_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Header");
    private final static QName _RemoveScopesResponse_QNAME = new QName("http://bee/", "removeScopesResponse");
    private final static QName _StartFirmwareUpgradeResponse_QNAME = new QName("http://bee/", "startFirmwareUpgradeResponse");
    private final static QName _ProducerProperties_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ProducerProperties");
    private final static QName _CreateUsers_QNAME = new QName("http://bee/", "createUsers");
    private final static QName _GetCapabilities_QNAME = new QName("http://bee/", "getCapabilities");
    private final static QName _SetGeoLocation_QNAME = new QName("http://bee/", "setGeoLocation");
    private final static QName _SetClientCertificateModeResponse_QNAME = new QName("http://bee/", "setClientCertificateModeResponse");
    private final static QName _SetHostnameFromDHCP_QNAME = new QName("http://bee/", "setHostnameFromDHCP");
    private final static QName _GetStorageConfigurationsResponse_QNAME = new QName("http://bee/", "getStorageConfigurationsResponse");
    private final static QName _ReferenceParameters_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ReferenceParameters");
    private final static QName _GetDNS_QNAME = new QName("http://bee/", "getDNS");
    private final static QName _GetDeviceInformationResponse_QNAME = new QName("http://bee/", "getDeviceInformationResponse");
    private final static QName _RemoveScopes_QNAME = new QName("http://bee/", "removeScopes");
    private final static QName _TopicNotSupportedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicNotSupportedFault");
    private final static QName _SetNetworkInterfacesResponse_QNAME = new QName("http://bee/", "setNetworkInterfacesResponse");
    private final static QName _GetSystemDateAndTime_QNAME = new QName("http://bee/", "getSystemDateAndTime");
    private final static QName _StartSystemRestoreResponse_QNAME = new QName("http://bee/", "startSystemRestoreResponse");
    private final static QName _GetCertificates_QNAME = new QName("http://bee/", "getCertificates");
    private final static QName _SetDot1XConfigurationResponse_QNAME = new QName("http://bee/", "setDot1XConfigurationResponse");
    private final static QName _TopicNamespace_QNAME = new QName("http://docs.oasis-open.org/wsn/t-1", "TopicNamespace");
    private final static QName _GetClientCertificateModeResponse_QNAME = new QName("http://bee/", "getClientCertificateModeResponse");
    private final static QName _DeleteStorageConfigurationResponse_QNAME = new QName("http://bee/", "deleteStorageConfigurationResponse");
    private final static QName _GetDot11StatusResponse_QNAME = new QName("http://bee/", "getDot11StatusResponse");
    private final static QName _CreateUsersResponse_QNAME = new QName("http://bee/", "createUsersResponse");
    private final static QName _GetHostname_QNAME = new QName("http://bee/", "getHostname");
    private final static QName _SetNetworkDefaultGateway_QNAME = new QName("http://bee/", "setNetworkDefaultGateway");
    private final static QName _Fault_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Fault");
    private final static QName _GetCapabilitiesResponse_QNAME = new QName("http://bee/", "getCapabilitiesResponse");
    private final static QName _MessageContent_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "MessageContent");
    private final static QName _GetEndpointReference_QNAME = new QName("http://bee/", "getEndpointReference");
    private final static QName _GetDPAddressesResponse_QNAME = new QName("http://bee/", "getDPAddressesResponse");
    private final static QName _GetWsdlUrlResponse_QNAME = new QName("http://bee/", "getWsdlUrlResponse");
    private final static QName _ConsumerReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ConsumerReference");
    private final static QName _ProblemIRI_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemIRI");
    private final static QName _GetClientCertificateMode_QNAME = new QName("http://bee/", "getClientCertificateMode");
    private final static QName _GetDot1XConfigurations_QNAME = new QName("http://bee/", "getDot1XConfigurations");
    private final static QName _GetGeoLocationResponse_QNAME = new QName("http://bee/", "getGeoLocationResponse");
    private final static QName _DeleteDot1XConfigurationResponse_QNAME = new QName("http://bee/", "deleteDot1XConfigurationResponse");
    private final static QName _LoadCertificateWithPrivateKeyResponse_QNAME = new QName("http://bee/", "loadCertificateWithPrivateKeyResponse");
    private final static QName _GetDiscoveryMode_QNAME = new QName("http://bee/", "getDiscoveryMode");
    private final static QName _GetNetworkProtocolsResponse_QNAME = new QName("http://bee/", "getNetworkProtocolsResponse");
    private final static QName _SetRelayOutputSettingsResponse_QNAME = new QName("http://bee/", "setRelayOutputSettingsResponse");
    private final static QName _InvalidFilterFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidFilterFault");
    private final static QName _SendAuxiliaryCommandResponse_QNAME = new QName("http://bee/", "sendAuxiliaryCommandResponse");
    private final static QName _SetDPAddressesResponse_QNAME = new QName("http://bee/", "setDPAddressesResponse");
    private final static QName _SubscriptionReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionReference");
    private final static QName _GetServicesResponse_QNAME = new QName("http://bee/", "getServicesResponse");
    private final static QName _GetSystemSupportInformation_QNAME = new QName("http://bee/", "getSystemSupportInformation");
    private final static QName _GetSystemBackup_QNAME = new QName("http://bee/", "getSystemBackup");
    private final static QName _RetryAfter_QNAME = new QName("http://www.w3.org/2005/08/addressing", "RetryAfter");
    private final static QName _MetadataConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "MetadataConfiguration");
    private final static QName _SetDynamicDNSResponse_QNAME = new QName("http://bee/", "setDynamicDNSResponse");
    private final static QName _GetCertificateInformationResponse_QNAME = new QName("http://bee/", "getCertificateInformationResponse");
    private final static QName _StartSystemRestore_QNAME = new QName("http://bee/", "startSystemRestore");
    private final static QName _RestoreSystem_QNAME = new QName("http://bee/", "restoreSystem");
    private final static QName _SetRelayOutputStateResponse_QNAME = new QName("http://bee/", "setRelayOutputStateResponse");
    private final static QName _FaultTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "FaultTo");
    private final static QName _LoadCertificates_QNAME = new QName("http://bee/", "loadCertificates");
    private final static QName _AddScopesResponse_QNAME = new QName("http://bee/", "addScopesResponse");
    private final static QName _PauseFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "PauseFailedFault");
    private final static QName _UnableToDestroyPullPointFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroyPullPointFault");
    private final static QName _Polyline_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polyline");
    private final static QName _GetSystemDateAndTimeResponse_QNAME = new QName("http://bee/", "getSystemDateAndTimeResponse");
    private final static QName _SetAccessPolicy_QNAME = new QName("http://bee/", "setAccessPolicy");
    private final static QName _SetGeoLocationResponse_QNAME = new QName("http://bee/", "setGeoLocationResponse");
    private final static QName _CreateDot1XConfigurationResponse_QNAME = new QName("http://bee/", "createDot1XConfigurationResponse");
    private final static QName _GetWsdlUrl_QNAME = new QName("http://bee/", "getWsdlUrl");
    private final static QName _SetZeroConfigurationResponse_QNAME = new QName("http://bee/", "setZeroConfigurationResponse");
    private final static QName _GetStorageConfiguration_QNAME = new QName("http://bee/", "getStorageConfiguration");
    private final static QName _ProblemAction_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemAction");
    private final static QName _TopicSet_QNAME = new QName("http://docs.oasis-open.org/wsn/t-1", "TopicSet");
    private final static QName _MultipleTopicsSpecifiedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "MultipleTopicsSpecifiedFault");
    private final static QName _SetDPAddresses_QNAME = new QName("http://bee/", "setDPAddresses");
    private final static QName _SetRemoteDiscoveryMode_QNAME = new QName("http://bee/", "setRemoteDiscoveryMode");
    private final static QName _SystemReboot_QNAME = new QName("http://bee/", "systemReboot");
    private final static QName _SetDot1XConfiguration_QNAME = new QName("http://bee/", "setDot1XConfiguration");
    private final static QName _Filter_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "Filter");
    private final static QName _NotUnderstood_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "NotUnderstood");
    private final static QName _DeleteGeoLocation_QNAME = new QName("http://bee/", "deleteGeoLocation");
    private final static QName _CurrentTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "CurrentTime");
    private final static QName _Upgrade_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Upgrade");
    private final static QName _GetDPAddresses_QNAME = new QName("http://bee/", "getDPAddresses");
    private final static QName _InvalidMessageContentExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidMessageContentExpressionFault");
    private final static QName _Polygon_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polygon");
    private final static QName _DeleteCertificatesResponse_QNAME = new QName("http://bee/", "deleteCertificatesResponse");
    private final static QName _TopicExpressionDialectUnknownFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialectUnknownFault");
    private final static QName _SetSystemDateAndTimeResponse_QNAME = new QName("http://bee/", "setSystemDateAndTimeResponse");
    private final static QName _SubscribeCreationFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscribeCreationFailedFault");
    private final static QName _AddIPAddressFilterResponse_QNAME = new QName("http://bee/", "addIPAddressFilterResponse");
    private final static QName _GetStorageConfigurationResponse_QNAME = new QName("http://bee/", "getStorageConfigurationResponse");
    private final static QName _GetDot11Status_QNAME = new QName("http://bee/", "getDot11Status");
    private final static QName _GetRemoteDiscoveryModeResponse_QNAME = new QName("http://bee/", "getRemoteDiscoveryModeResponse");
    private final static QName _TerminationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
    private final static QName _MessageID_QNAME = new QName("http://www.w3.org/2005/08/addressing", "MessageID");
    private final static QName _SetRelayOutputSettings_QNAME = new QName("http://bee/", "setRelayOutputSettings");
    private final static QName _VideoEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoEncoderConfiguration");
    private final static QName _Action_QNAME = new QName("http://www.w3.org/2005/08/addressing", "Action");
    private final static QName _SetStorageConfigurationResponse_QNAME = new QName("http://bee/", "setStorageConfigurationResponse");
    private final static QName _GetAccessPolicyResponse_QNAME = new QName("http://bee/", "getAccessPolicyResponse");
    private final static QName _GetIPAddressFilterResponse_QNAME = new QName("http://bee/", "getIPAddressFilterResponse");
    private final static QName _SetRemoteUserResponse_QNAME = new QName("http://bee/", "setRemoteUserResponse");
    private final static QName _GetNetworkInterfaces_QNAME = new QName("http://bee/", "getNetworkInterfaces");
    private final static QName _RelatesTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "RelatesTo");
    private final static QName _AudioSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioSourceConfiguration");
    private final static QName _GetCertificatesResponse_QNAME = new QName("http://bee/", "getCertificatesResponse");
    private final static QName _GetCertificatesStatus_QNAME = new QName("http://bee/", "getCertificatesStatus");
    private final static QName _GetZeroConfigurationResponse_QNAME = new QName("http://bee/", "getZeroConfigurationResponse");
    private final static QName _SetNetworkProtocols_QNAME = new QName("http://bee/", "setNetworkProtocols");
    private final static QName _SetDynamicDNS_QNAME = new QName("http://bee/", "setDynamicDNS");
    private final static QName _SetHostnameFromDHCPResponse_QNAME = new QName("http://bee/", "setHostnameFromDHCPResponse");
    private final static QName _UnsupportedPolicyRequestFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnsupportedPolicyRequestFault");
    private final static QName _GetServiceCapabilitiesResponse_QNAME = new QName("http://bee/", "getServiceCapabilitiesResponse");
    private final static QName _GetSystemBackupResponse_QNAME = new QName("http://bee/", "getSystemBackupResponse");
    private final static QName _GetHostnameResponse_QNAME = new QName("http://bee/", "getHostnameResponse");
    private final static QName _SetUser_QNAME = new QName("http://bee/", "setUser");
    private final static QName _DeleteGeoLocationResponse_QNAME = new QName("http://bee/", "deleteGeoLocationResponse");
    private final static QName _GetSystemSupportInformationResponse_QNAME = new QName("http://bee/", "getSystemSupportInformationResponse");
    private final static QName _SendAuxiliaryCommand_QNAME = new QName("http://bee/", "sendAuxiliaryCommand");
    private final static QName _SetZeroConfiguration_QNAME = new QName("http://bee/", "setZeroConfiguration");
    private final static QName _BaseFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/bf-2", "BaseFault");
    private final static QName _DeleteStorageConfiguration_QNAME = new QName("http://bee/", "deleteStorageConfiguration");
    private final static QName _GetNetworkDefaultGatewayResponse_QNAME = new QName("http://bee/", "getNetworkDefaultGatewayResponse");
    private final static QName _GetUsers_QNAME = new QName("http://bee/", "getUsers");
    private final static QName _GetDot11CapabilitiesResponse_QNAME = new QName("http://bee/", "getDot11CapabilitiesResponse");
    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/device/wsdl", "Capabilities");
    private final static QName _ReplyTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ReplyTo");
    private final static QName _SetSystemDateAndTime_QNAME = new QName("http://bee/", "setSystemDateAndTime");
    private final static QName _FixedTopicSet_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "FixedTopicSet");
    private final static QName _GetServiceCapabilities_QNAME = new QName("http://bee/", "getServiceCapabilities");
    private final static QName _ProblemHeaderQName_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemHeaderQName");
    private final static QName _GetScopes_QNAME = new QName("http://bee/", "getScopes");
    private final static QName _To_QNAME = new QName("http://www.w3.org/2005/08/addressing", "To");
    private final static QName _SetRelayOutputState_QNAME = new QName("http://bee/", "setRelayOutputState");
    private final static QName _GetSystemLog_QNAME = new QName("http://bee/", "getSystemLog");
    private final static QName _SetDNS_QNAME = new QName("http://bee/", "setDNS");
    private final static QName _SetDNSResponse_QNAME = new QName("http://bee/", "setDNSResponse");
    private final static QName _UnacceptableInitialTerminationTimeFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableInitialTerminationTimeFault");
    private final static QName _LoadCACertificates_QNAME = new QName("http://bee/", "loadCACertificates");
    private final static QName _SetStorageConfiguration_QNAME = new QName("http://bee/", "setStorageConfiguration");
    private final static QName _GetRemoteUser_QNAME = new QName("http://bee/", "getRemoteUser");
    private final static QName _VideoAnalyticsConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoAnalyticsConfiguration");
    private final static QName _GetStorageConfigurations_QNAME = new QName("http://bee/", "getStorageConfigurations");
    private final static QName _AudioDecoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioDecoderConfiguration");
    private final static QName _AudioOutputConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioOutputConfiguration");
    private final static QName _RemoveIPAddressFilterResponse_QNAME = new QName("http://bee/", "removeIPAddressFilterResponse");
    private final static QName _SetDiscoveryModeResponse_QNAME = new QName("http://bee/", "setDiscoveryModeResponse");
    private final static QName _SetNetworkProtocolsResponse_QNAME = new QName("http://bee/", "setNetworkProtocolsResponse");
    private final static QName _SetRemoteUser_QNAME = new QName("http://bee/", "setRemoteUser");
    private final static QName _GetGeoLocation_QNAME = new QName("http://bee/", "getGeoLocation");
    private final static QName _GetDot1XConfiguration_QNAME = new QName("http://bee/", "getDot1XConfiguration");
    private final static QName _GetDynamicDNS_QNAME = new QName("http://bee/", "getDynamicDNS");
    private final static QName _ScanAvailableDot11NetworksResponse_QNAME = new QName("http://bee/", "scanAvailableDot11NetworksResponse");
    private final static QName _GetEndpointReferenceResponse_QNAME = new QName("http://bee/", "getEndpointReferenceResponse");
    private final static QName _NoCurrentMessageOnTopicFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NoCurrentMessageOnTopicFault");
    private final static QName _UnableToGetMessagesFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToGetMessagesFault");
    private final static QName _GetPkcs10Request_QNAME = new QName("http://bee/", "getPkcs10Request");
    private final static QName _CreateCertificateResponse_QNAME = new QName("http://bee/", "createCertificateResponse");
    private final static QName _SetNTP_QNAME = new QName("http://bee/", "setNTP");
    private final static QName _GetAccessPolicy_QNAME = new QName("http://bee/", "getAccessPolicy");
    private final static QName _GetRelayOutputsResponse_QNAME = new QName("http://bee/", "getRelayOutputsResponse");
    private final static QName _DeleteCertificates_QNAME = new QName("http://bee/", "deleteCertificates");
    private final static QName _TopicExpression_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpression");
    private final static QName _UnableToCreatePullPointFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToCreatePullPointFault");
    private final static QName _AddScopes_QNAME = new QName("http://bee/", "addScopes");
    private final static QName _GetNTP_QNAME = new QName("http://bee/", "getNTP");
    private final static QName _GetNTPResponse_QNAME = new QName("http://bee/", "getNTPResponse");
    private final static QName _Metadata_QNAME = new QName("http://www.w3.org/2005/08/addressing", "Metadata");
    private final static QName _InvalidTopicExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidTopicExpressionFault");
    private final static QName _GetScopesResponse_QNAME = new QName("http://bee/", "getScopesResponse");
    private final static QName _DeleteUsersResponse_QNAME = new QName("http://bee/", "deleteUsersResponse");
    private final static QName _GetNetworkInterfacesResponse_QNAME = new QName("http://bee/", "getNetworkInterfacesResponse");
    private final static QName _DeleteUsers_QNAME = new QName("http://bee/", "deleteUsers");
    private final static QName _GetCACertificatesResponse_QNAME = new QName("http://bee/", "getCACertificatesResponse");
    private final static QName _Body_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Body");
    private final static QName _LoadCertificateWithPrivateKey_QNAME = new QName("http://bee/", "loadCertificateWithPrivateKey");
    private final static QName _SetUserResponse_QNAME = new QName("http://bee/", "setUserResponse");
    private final static QName _SetCertificatesStatusResponse_QNAME = new QName("http://bee/", "setCertificatesStatusResponse");
    private final static QName _SetNTPResponse_QNAME = new QName("http://bee/", "setNTPResponse");
    private final static QName _CreateCertificate_QNAME = new QName("http://bee/", "createCertificate");
    private final static QName _NotifyMessageNotSupportedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NotifyMessageNotSupportedFault");
    private final static QName _DeleteDot1XConfiguration_QNAME = new QName("http://bee/", "deleteDot1XConfiguration");
    private final static QName _GetCertificateInformation_QNAME = new QName("http://bee/", "getCertificateInformation");
    private final static QName _SetIPAddressFilterResponse_QNAME = new QName("http://bee/", "setIPAddressFilterResponse");
    private final static QName _SetRemoteDiscoveryModeResponse_QNAME = new QName("http://bee/", "setRemoteDiscoveryModeResponse");
    private final static QName _RemoveIPAddressFilter_QNAME = new QName("http://bee/", "removeIPAddressFilter");
    private final static QName _SetAccessPolicyResponse_QNAME = new QName("http://bee/", "setAccessPolicyResponse");
    private final static QName _SetScopes_QNAME = new QName("http://bee/", "setScopes");
    private final static QName _UpgradeSystemFirmwareResponse_QNAME = new QName("http://bee/", "upgradeSystemFirmwareResponse");
    private final static QName _ScanAvailableDot11Networks_QNAME = new QName("http://bee/", "scanAvailableDot11Networks");
    private final static QName _GetDot1XConfigurationsResponse_QNAME = new QName("http://bee/", "getDot1XConfigurationsResponse");
    private final static QName _TopicExpressionDialect_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialect");
    private final static QName _UnrecognizedPolicyRequestFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnrecognizedPolicyRequestFault");
    private final static QName _VideoSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoSourceConfiguration");
    private final static QName _GetIPAddressFilter_QNAME = new QName("http://bee/", "getIPAddressFilter");
    private final static QName _GetCACertificates_QNAME = new QName("http://bee/", "getCACertificates");
    private final static QName _GetDeviceInformation_QNAME = new QName("http://bee/", "getDeviceInformation");
    private final static QName _NotificationMessage_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NotificationMessage");
    private final static QName _SubscriptionPolicy_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionPolicy");
    private final static QName _GetUsersResponse_QNAME = new QName("http://bee/", "getUsersResponse");
    private final static QName _GetPkcs10RequestResponse_QNAME = new QName("http://bee/", "getPkcs10RequestResponse");
    private final static QName _GetSystemLogResponse_QNAME = new QName("http://bee/", "getSystemLogResponse");
    private final static QName _Topic_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "Topic");
    private final static QName _GetDynamicDNSResponse_QNAME = new QName("http://bee/", "getDynamicDNSResponse");
    private final static QName _SetCertificatesStatus_QNAME = new QName("http://bee/", "setCertificatesStatus");
    private final static QName _ResumeFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ResumeFailedFault");
    private final static QName _GetServices_QNAME = new QName("http://bee/", "getServices");
    private final static QName _GetRelayOutputs_QNAME = new QName("http://bee/", "getRelayOutputs");
    private final static QName _StartFirmwareUpgrade_QNAME = new QName("http://bee/", "startFirmwareUpgrade");
    private final static QName _SetClientCertificateMode_QNAME = new QName("http://bee/", "setClientCertificateMode");
    private final static QName _SetNetworkDefaultGatewayResponse_QNAME = new QName("http://bee/", "setNetworkDefaultGatewayResponse");
    private final static QName _GetSystemUris_QNAME = new QName("http://bee/", "getSystemUris");
    private final static QName _GetDiscoveryModeResponse_QNAME = new QName("http://bee/", "getDiscoveryModeResponse");
    private final static QName _GetNetworkDefaultGateway_QNAME = new QName("http://bee/", "getNetworkDefaultGateway");
    private final static QName _GetCertificatesStatusResponse_QNAME = new QName("http://bee/", "getCertificatesStatusResponse");
    private final static QName _AddIPAddressFilter_QNAME = new QName("http://bee/", "addIPAddressFilter");
    private final static QName _PTZConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "PTZConfiguration");
    private final static QName _AudioEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioEncoderConfiguration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bee.generated.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link GetSystemUrisResponse }
     * 
     */
    public GetSystemUrisResponse createGetSystemUrisResponse() {
        return new GetSystemUrisResponse();
    }

    /**
     * Create an instance of {@link GetSystemUris2 }
     * 
     */
    public GetSystemUris2 createGetSystemUris2() {
        return new GetSystemUris2();
    }

    /**
     * Create an instance of {@link GetEndpointReference2 }
     * 
     */
    public GetEndpointReference2 createGetEndpointReference2() {
        return new GetEndpointReference2();
    }

    /**
     * Create an instance of {@link GetEndpointReferenceResponse2 }
     * 
     */
    public GetEndpointReferenceResponse2 createGetEndpointReferenceResponse2() {
        return new GetEndpointReferenceResponse2();
    }

    /**
     * Create an instance of {@link GetDot11Capabilities2 }
     * 
     */
    public GetDot11Capabilities2 createGetDot11Capabilities2() {
        return new GetDot11Capabilities2();
    }

    /**
     * Create an instance of {@link GetDot11CapabilitiesResponse2 }
     * 
     */
    public GetDot11CapabilitiesResponse2 createGetDot11CapabilitiesResponse2() {
        return new GetDot11CapabilitiesResponse2();
    }

    /**
     * Create an instance of {@link EventSubscription }
     * 
     */
    public EventSubscription createEventSubscription() {
        return new EventSubscription();
    }

    /**
     * Create an instance of {@link ConfigDescription }
     * 
     */
    public ConfigDescription createConfigDescription() {
        return new ConfigDescription();
    }

    /**
     * Create an instance of {@link ItemListDescription }
     * 
     */
    public ItemListDescription createItemListDescription() {
        return new ItemListDescription();
    }

    /**
     * Create an instance of {@link ItemList }
     * 
     */
    public ItemList createItemList() {
        return new ItemList();
    }

    /**
     * Create an instance of {@link UserCredential }
     * 
     */
    public UserCredential createUserCredential() {
        return new UserCredential();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link StorageConfigurationData }
     * 
     */
    public StorageConfigurationData createStorageConfigurationData() {
        return new StorageConfigurationData();
    }

    /**
     * Create an instance of {@link TopicNamespaceType }
     * 
     */
    public TopicNamespaceType createTopicNamespaceType() {
        return new TopicNamespaceType();
    }

    /**
     * Create an instance of {@link BaseFaultType }
     * 
     */
    public BaseFaultType createBaseFaultType() {
        return new BaseFaultType();
    }

    /**
     * Create an instance of {@link NotificationMessageHolderType }
     * 
     */
    public NotificationMessageHolderType createNotificationMessageHolderType() {
        return new NotificationMessageHolderType();
    }

    /**
     * Create an instance of {@link QueryExpressionType }
     * 
     */
    public QueryExpressionType createQueryExpressionType() {
        return new QueryExpressionType();
    }

    /**
     * Create an instance of {@link SubscribeCreationFailedFaultType }
     * 
     */
    public SubscribeCreationFailedFaultType createSubscribeCreationFailedFaultType() {
        return new SubscribeCreationFailedFaultType();
    }

    /**
     * Create an instance of {@link Notify }
     * 
     */
    public Notify createNotify() {
        return new Notify();
    }

    /**
     * Create an instance of {@link PauseSubscription }
     * 
     */
    public PauseSubscription createPauseSubscription() {
        return new PauseSubscription();
    }

    /**
     * Create an instance of {@link UnableToDestroySubscriptionFaultType }
     * 
     */
    public UnableToDestroySubscriptionFaultType createUnableToDestroySubscriptionFaultType() {
        return new UnableToDestroySubscriptionFaultType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link Subscribe.SubscriptionPolicy }
     * 
     */
    public Subscribe.SubscriptionPolicy createSubscribeSubscriptionPolicy() {
        return new Subscribe.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link UnsubscribeResponse }
     * 
     */
    public UnsubscribeResponse createUnsubscribeResponse() {
        return new UnsubscribeResponse();
    }

    /**
     * Create an instance of {@link DestroyPullPoint }
     * 
     */
    public DestroyPullPoint createDestroyPullPoint() {
        return new DestroyPullPoint();
    }

    /**
     * Create an instance of {@link TopicExpressionType }
     * 
     */
    public TopicExpressionType createTopicExpressionType() {
        return new TopicExpressionType();
    }

    /**
     * Create an instance of {@link UnableToCreatePullPointFaultType }
     * 
     */
    public UnableToCreatePullPointFaultType createUnableToCreatePullPointFaultType() {
        return new UnableToCreatePullPointFaultType();
    }

    /**
     * Create an instance of {@link InvalidProducerPropertiesExpressionFaultType }
     * 
     */
    public InvalidProducerPropertiesExpressionFaultType createInvalidProducerPropertiesExpressionFaultType() {
        return new InvalidProducerPropertiesExpressionFaultType();
    }

    /**
     * Create an instance of {@link GetMessages }
     * 
     */
    public GetMessages createGetMessages() {
        return new GetMessages();
    }

    /**
     * Create an instance of {@link InvalidTopicExpressionFaultType }
     * 
     */
    public InvalidTopicExpressionFaultType createInvalidTopicExpressionFaultType() {
        return new InvalidTopicExpressionFaultType();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link GetCurrentMessage }
     * 
     */
    public GetCurrentMessage createGetCurrentMessage() {
        return new GetCurrentMessage();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link InvalidFilterFaultType }
     * 
     */
    public InvalidFilterFaultType createInvalidFilterFaultType() {
        return new InvalidFilterFaultType();
    }

    /**
     * Create an instance of {@link CreatePullPoint }
     * 
     */
    public CreatePullPoint createCreatePullPoint() {
        return new CreatePullPoint();
    }

    /**
     * Create an instance of {@link UnsupportedPolicyRequestFaultType }
     * 
     */
    public UnsupportedPolicyRequestFaultType createUnsupportedPolicyRequestFaultType() {
        return new UnsupportedPolicyRequestFaultType();
    }

    /**
     * Create an instance of {@link NotifyMessageNotSupportedFaultType }
     * 
     */
    public NotifyMessageNotSupportedFaultType createNotifyMessageNotSupportedFaultType() {
        return new NotifyMessageNotSupportedFaultType();
    }

    /**
     * Create an instance of {@link ResumeSubscriptionResponse }
     * 
     */
    public ResumeSubscriptionResponse createResumeSubscriptionResponse() {
        return new ResumeSubscriptionResponse();
    }

    /**
     * Create an instance of {@link PauseSubscriptionResponse }
     * 
     */
    public PauseSubscriptionResponse createPauseSubscriptionResponse() {
        return new PauseSubscriptionResponse();
    }

    /**
     * Create an instance of {@link UnacceptableTerminationTimeFaultType }
     * 
     */
    public UnacceptableTerminationTimeFaultType createUnacceptableTerminationTimeFaultType() {
        return new UnacceptableTerminationTimeFaultType();
    }

    /**
     * Create an instance of {@link UnrecognizedPolicyRequestFaultType }
     * 
     */
    public UnrecognizedPolicyRequestFaultType createUnrecognizedPolicyRequestFaultType() {
        return new UnrecognizedPolicyRequestFaultType();
    }

    /**
     * Create an instance of {@link ResumeSubscription }
     * 
     */
    public ResumeSubscription createResumeSubscription() {
        return new ResumeSubscription();
    }

    /**
     * Create an instance of {@link SubscriptionManagerRP }
     * 
     */
    public SubscriptionManagerRP createSubscriptionManagerRP() {
        return new SubscriptionManagerRP();
    }

    /**
     * Create an instance of {@link SubscriptionPolicyType }
     * 
     */
    public SubscriptionPolicyType createSubscriptionPolicyType() {
        return new SubscriptionPolicyType();
    }

    /**
     * Create an instance of {@link NotificationProducerRP }
     * 
     */
    public NotificationProducerRP createNotificationProducerRP() {
        return new NotificationProducerRP();
    }

    /**
     * Create an instance of {@link TopicSetType }
     * 
     */
    public TopicSetType createTopicSetType() {
        return new TopicSetType();
    }

    /**
     * Create an instance of {@link UseRaw }
     * 
     */
    public UseRaw createUseRaw() {
        return new UseRaw();
    }

    /**
     * Create an instance of {@link CreatePullPointResponse }
     * 
     */
    public CreatePullPointResponse createCreatePullPointResponse() {
        return new CreatePullPointResponse();
    }

    /**
     * Create an instance of {@link GetMessagesResponse }
     * 
     */
    public GetMessagesResponse createGetMessagesResponse() {
        return new GetMessagesResponse();
    }

    /**
     * Create an instance of {@link UnacceptableInitialTerminationTimeFaultType }
     * 
     */
    public UnacceptableInitialTerminationTimeFaultType createUnacceptableInitialTerminationTimeFaultType() {
        return new UnacceptableInitialTerminationTimeFaultType();
    }

    /**
     * Create an instance of {@link PauseFailedFaultType }
     * 
     */
    public PauseFailedFaultType createPauseFailedFaultType() {
        return new PauseFailedFaultType();
    }

    /**
     * Create an instance of {@link UnableToDestroyPullPointFaultType }
     * 
     */
    public UnableToDestroyPullPointFaultType createUnableToDestroyPullPointFaultType() {
        return new UnableToDestroyPullPointFaultType();
    }

    /**
     * Create an instance of {@link Renew }
     * 
     */
    public Renew createRenew() {
        return new Renew();
    }

    /**
     * Create an instance of {@link TopicNotSupportedFaultType }
     * 
     */
    public TopicNotSupportedFaultType createTopicNotSupportedFaultType() {
        return new TopicNotSupportedFaultType();
    }

    /**
     * Create an instance of {@link GetCurrentMessageResponse }
     * 
     */
    public GetCurrentMessageResponse createGetCurrentMessageResponse() {
        return new GetCurrentMessageResponse();
    }

    /**
     * Create an instance of {@link RenewResponse }
     * 
     */
    public RenewResponse createRenewResponse() {
        return new RenewResponse();
    }

    /**
     * Create an instance of {@link MultipleTopicsSpecifiedFaultType }
     * 
     */
    public MultipleTopicsSpecifiedFaultType createMultipleTopicsSpecifiedFaultType() {
        return new MultipleTopicsSpecifiedFaultType();
    }

    /**
     * Create an instance of {@link ResumeFailedFaultType }
     * 
     */
    public ResumeFailedFaultType createResumeFailedFaultType() {
        return new ResumeFailedFaultType();
    }

    /**
     * Create an instance of {@link InvalidMessageContentExpressionFaultType }
     * 
     */
    public InvalidMessageContentExpressionFaultType createInvalidMessageContentExpressionFaultType() {
        return new InvalidMessageContentExpressionFaultType();
    }

    /**
     * Create an instance of {@link NoCurrentMessageOnTopicFaultType }
     * 
     */
    public NoCurrentMessageOnTopicFaultType createNoCurrentMessageOnTopicFaultType() {
        return new NoCurrentMessageOnTopicFaultType();
    }

    /**
     * Create an instance of {@link UnableToGetMessagesFaultType }
     * 
     */
    public UnableToGetMessagesFaultType createUnableToGetMessagesFaultType() {
        return new UnableToGetMessagesFaultType();
    }

    /**
     * Create an instance of {@link DestroyPullPointResponse }
     * 
     */
    public DestroyPullPointResponse createDestroyPullPointResponse() {
        return new DestroyPullPointResponse();
    }

    /**
     * Create an instance of {@link TopicExpressionDialectUnknownFaultType }
     * 
     */
    public TopicExpressionDialectUnknownFaultType createTopicExpressionDialectUnknownFaultType() {
        return new TopicExpressionDialectUnknownFaultType();
    }

    /**
     * Create an instance of {@link AttributedURIType }
     * 
     */
    public AttributedURIType createAttributedURIType() {
        return new AttributedURIType();
    }

    /**
     * Create an instance of {@link ReferenceParametersType }
     * 
     */
    public ReferenceParametersType createReferenceParametersType() {
        return new ReferenceParametersType();
    }

    /**
     * Create an instance of {@link AttributedUnsignedLongType }
     * 
     */
    public AttributedUnsignedLongType createAttributedUnsignedLongType() {
        return new AttributedUnsignedLongType();
    }

    /**
     * Create an instance of {@link MetadataType }
     * 
     */
    public MetadataType createMetadataType() {
        return new MetadataType();
    }

    /**
     * Create an instance of {@link RelatesToType }
     * 
     */
    public RelatesToType createRelatesToType() {
        return new RelatesToType();
    }

    /**
     * Create an instance of {@link ProblemActionType }
     * 
     */
    public ProblemActionType createProblemActionType() {
        return new ProblemActionType();
    }

    /**
     * Create an instance of {@link AttributedQNameType }
     * 
     */
    public AttributedQNameType createAttributedQNameType() {
        return new AttributedQNameType();
    }

    /**
     * Create an instance of {@link TopicType }
     * 
     */
    public TopicType createTopicType() {
        return new TopicType();
    }

    /**
     * Create an instance of {@link Documentation }
     * 
     */
    public Documentation createDocumentation() {
        return new Documentation();
    }

    /**
     * Create an instance of {@link QueryExpressionType2 }
     * 
     */
    public QueryExpressionType2 createQueryExpressionType2() {
        return new QueryExpressionType2();
    }

    /**
     * Create an instance of {@link GetCertificatesResponse }
     * 
     */
    public GetCertificatesResponse createGetCertificatesResponse() {
        return new GetCertificatesResponse();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link UpgradeSystemFirmware }
     * 
     */
    public UpgradeSystemFirmware createUpgradeSystemFirmware() {
        return new UpgradeSystemFirmware();
    }

    /**
     * Create an instance of {@link AttachmentData }
     * 
     */
    public AttachmentData createAttachmentData() {
        return new AttachmentData();
    }

    /**
     * Create an instance of {@link SystemLogUriList }
     * 
     */
    public SystemLogUriList createSystemLogUriList() {
        return new SystemLogUriList();
    }

    /**
     * Create an instance of {@link GetSystemUrisResponse.Extension }
     * 
     */
    public GetSystemUrisResponse.Extension createGetSystemUrisResponseExtension() {
        return new GetSystemUrisResponse.Extension();
    }

    /**
     * Create an instance of {@link RestoreSystemResponse }
     * 
     */
    public RestoreSystemResponse createRestoreSystemResponse() {
        return new RestoreSystemResponse();
    }

    /**
     * Create an instance of {@link SetSystemFactoryDefaultResponse }
     * 
     */
    public SetSystemFactoryDefaultResponse createSetSystemFactoryDefaultResponse() {
        return new SetSystemFactoryDefaultResponse();
    }

    /**
     * Create an instance of {@link DeleteUsers }
     * 
     */
    public DeleteUsers createDeleteUsers() {
        return new DeleteUsers();
    }

    /**
     * Create an instance of {@link SetHostnameFromDHCPResponse }
     * 
     */
    public SetHostnameFromDHCPResponse createSetHostnameFromDHCPResponse() {
        return new SetHostnameFromDHCPResponse();
    }

    /**
     * Create an instance of {@link SetSystemFactoryDefault }
     * 
     */
    public SetSystemFactoryDefault createSetSystemFactoryDefault() {
        return new SetSystemFactoryDefault();
    }

    /**
     * Create an instance of {@link SetStorageConfiguration }
     * 
     */
    public SetStorageConfiguration createSetStorageConfiguration() {
        return new SetStorageConfiguration();
    }

    /**
     * Create an instance of {@link StorageConfiguration }
     * 
     */
    public StorageConfiguration createStorageConfiguration() {
        return new StorageConfiguration();
    }

    /**
     * Create an instance of {@link DeleteGeoLocationResponse }
     * 
     */
    public DeleteGeoLocationResponse createDeleteGeoLocationResponse() {
        return new DeleteGeoLocationResponse();
    }

    /**
     * Create an instance of {@link SetRemoteUser }
     * 
     */
    public SetRemoteUser createSetRemoteUser() {
        return new SetRemoteUser();
    }

    /**
     * Create an instance of {@link RemoteUser }
     * 
     */
    public RemoteUser createRemoteUser() {
        return new RemoteUser();
    }

    /**
     * Create an instance of {@link SetRelayOutputSettings }
     * 
     */
    public SetRelayOutputSettings createSetRelayOutputSettings() {
        return new SetRelayOutputSettings();
    }

    /**
     * Create an instance of {@link RelayOutputSettings }
     * 
     */
    public RelayOutputSettings createRelayOutputSettings() {
        return new RelayOutputSettings();
    }

    /**
     * Create an instance of {@link GetRemoteUserResponse }
     * 
     */
    public GetRemoteUserResponse createGetRemoteUserResponse() {
        return new GetRemoteUserResponse();
    }

    /**
     * Create an instance of {@link AddScopes }
     * 
     */
    public AddScopes createAddScopes() {
        return new AddScopes();
    }

    /**
     * Create an instance of {@link SetDNSResponse }
     * 
     */
    public SetDNSResponse createSetDNSResponse() {
        return new SetDNSResponse();
    }

    /**
     * Create an instance of {@link SetDiscoveryModeResponse }
     * 
     */
    public SetDiscoveryModeResponse createSetDiscoveryModeResponse() {
        return new SetDiscoveryModeResponse();
    }

    /**
     * Create an instance of {@link GetSystemLogResponse }
     * 
     */
    public GetSystemLogResponse createGetSystemLogResponse() {
        return new GetSystemLogResponse();
    }

    /**
     * Create an instance of {@link SystemLog }
     * 
     */
    public SystemLog createSystemLog() {
        return new SystemLog();
    }

    /**
     * Create an instance of {@link GetScopes }
     * 
     */
    public GetScopes createGetScopes() {
        return new GetScopes();
    }

    /**
     * Create an instance of {@link DeleteCertificatesResponse }
     * 
     */
    public DeleteCertificatesResponse createDeleteCertificatesResponse() {
        return new DeleteCertificatesResponse();
    }

    /**
     * Create an instance of {@link GetCertificates }
     * 
     */
    public GetCertificates createGetCertificates() {
        return new GetCertificates();
    }

    /**
     * Create an instance of {@link GetDeviceInformation }
     * 
     */
    public GetDeviceInformation createGetDeviceInformation() {
        return new GetDeviceInformation();
    }

    /**
     * Create an instance of {@link GetAccessPolicy }
     * 
     */
    public GetAccessPolicy createGetAccessPolicy() {
        return new GetAccessPolicy();
    }

    /**
     * Create an instance of {@link GetPkcs10RequestResponse }
     * 
     */
    public GetPkcs10RequestResponse createGetPkcs10RequestResponse() {
        return new GetPkcs10RequestResponse();
    }

    /**
     * Create an instance of {@link BinaryData }
     * 
     */
    public BinaryData createBinaryData() {
        return new BinaryData();
    }

    /**
     * Create an instance of {@link GetSystemUris }
     * 
     */
    public GetSystemUris createGetSystemUris() {
        return new GetSystemUris();
    }

    /**
     * Create an instance of {@link LoadCertificates }
     * 
     */
    public LoadCertificates createLoadCertificates() {
        return new LoadCertificates();
    }

    /**
     * Create an instance of {@link SetScopesResponse }
     * 
     */
    public SetScopesResponse createSetScopesResponse() {
        return new SetScopesResponse();
    }

    /**
     * Create an instance of {@link DeleteUsersResponse }
     * 
     */
    public DeleteUsersResponse createDeleteUsersResponse() {
        return new DeleteUsersResponse();
    }

    /**
     * Create an instance of {@link AddScopesResponse }
     * 
     */
    public AddScopesResponse createAddScopesResponse() {
        return new AddScopesResponse();
    }

    /**
     * Create an instance of {@link SetScopes }
     * 
     */
    public SetScopes createSetScopes() {
        return new SetScopes();
    }

    /**
     * Create an instance of {@link GetNetworkDefaultGateway }
     * 
     */
    public GetNetworkDefaultGateway createGetNetworkDefaultGateway() {
        return new GetNetworkDefaultGateway();
    }

    /**
     * Create an instance of {@link AddIPAddressFilterResponse }
     * 
     */
    public AddIPAddressFilterResponse createAddIPAddressFilterResponse() {
        return new AddIPAddressFilterResponse();
    }

    /**
     * Create an instance of {@link GetDiscoveryMode }
     * 
     */
    public GetDiscoveryMode createGetDiscoveryMode() {
        return new GetDiscoveryMode();
    }

    /**
     * Create an instance of {@link GetClientCertificateModeResponse }
     * 
     */
    public GetClientCertificateModeResponse createGetClientCertificateModeResponse() {
        return new GetClientCertificateModeResponse();
    }

    /**
     * Create an instance of {@link GetHostnameResponse }
     * 
     */
    public GetHostnameResponse createGetHostnameResponse() {
        return new GetHostnameResponse();
    }

    /**
     * Create an instance of {@link HostnameInformation }
     * 
     */
    public HostnameInformation createHostnameInformation() {
        return new HostnameInformation();
    }

    /**
     * Create an instance of {@link SetRemoteDiscoveryMode }
     * 
     */
    public SetRemoteDiscoveryMode createSetRemoteDiscoveryMode() {
        return new SetRemoteDiscoveryMode();
    }

    /**
     * Create an instance of {@link SetUserResponse }
     * 
     */
    public SetUserResponse createSetUserResponse() {
        return new SetUserResponse();
    }

    /**
     * Create an instance of {@link SetClientCertificateMode }
     * 
     */
    public SetClientCertificateMode createSetClientCertificateMode() {
        return new SetClientCertificateMode();
    }

    /**
     * Create an instance of {@link DeleteGeoLocation }
     * 
     */
    public DeleteGeoLocation createDeleteGeoLocation() {
        return new DeleteGeoLocation();
    }

    /**
     * Create an instance of {@link LocationEntity }
     * 
     */
    public LocationEntity createLocationEntity() {
        return new LocationEntity();
    }

    /**
     * Create an instance of {@link GetZeroConfigurationResponse }
     * 
     */
    public GetZeroConfigurationResponse createGetZeroConfigurationResponse() {
        return new GetZeroConfigurationResponse();
    }

    /**
     * Create an instance of {@link NetworkZeroConfiguration }
     * 
     */
    public NetworkZeroConfiguration createNetworkZeroConfiguration() {
        return new NetworkZeroConfiguration();
    }

    /**
     * Create an instance of {@link SetHostnameResponse }
     * 
     */
    public SetHostnameResponse createSetHostnameResponse() {
        return new SetHostnameResponse();
    }

    /**
     * Create an instance of {@link CreateUsers }
     * 
     */
    public CreateUsers createCreateUsers() {
        return new CreateUsers();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link LoadCertificatesResponse }
     * 
     */
    public LoadCertificatesResponse createLoadCertificatesResponse() {
        return new LoadCertificatesResponse();
    }

    /**
     * Create an instance of {@link GetDot11Capabilities }
     * 
     */
    public GetDot11Capabilities createGetDot11Capabilities() {
        return new GetDot11Capabilities();
    }

    /**
     * Create an instance of {@link GetDot1XConfigurationsResponse }
     * 
     */
    public GetDot1XConfigurationsResponse createGetDot1XConfigurationsResponse() {
        return new GetDot1XConfigurationsResponse();
    }

    /**
     * Create an instance of {@link Dot1XConfiguration }
     * 
     */
    public Dot1XConfiguration createDot1XConfiguration() {
        return new Dot1XConfiguration();
    }

    /**
     * Create an instance of {@link DeleteCertificates }
     * 
     */
    public DeleteCertificates createDeleteCertificates() {
        return new DeleteCertificates();
    }

    /**
     * Create an instance of {@link SetAccessPolicy }
     * 
     */
    public SetAccessPolicy createSetAccessPolicy() {
        return new SetAccessPolicy();
    }

    /**
     * Create an instance of {@link GetGeoLocationResponse }
     * 
     */
    public GetGeoLocationResponse createGetGeoLocationResponse() {
        return new GetGeoLocationResponse();
    }

    /**
     * Create an instance of {@link ScanAvailableDot11Networks }
     * 
     */
    public ScanAvailableDot11Networks createScanAvailableDot11Networks() {
        return new ScanAvailableDot11Networks();
    }

    /**
     * Create an instance of {@link ScanAvailableDot11NetworksResponse }
     * 
     */
    public ScanAvailableDot11NetworksResponse createScanAvailableDot11NetworksResponse() {
        return new ScanAvailableDot11NetworksResponse();
    }

    /**
     * Create an instance of {@link Dot11AvailableNetworks }
     * 
     */
    public Dot11AvailableNetworks createDot11AvailableNetworks() {
        return new Dot11AvailableNetworks();
    }

    /**
     * Create an instance of {@link GetCACertificates }
     * 
     */
    public GetCACertificates createGetCACertificates() {
        return new GetCACertificates();
    }

    /**
     * Create an instance of {@link GetSystemBackup }
     * 
     */
    public GetSystemBackup createGetSystemBackup() {
        return new GetSystemBackup();
    }

    /**
     * Create an instance of {@link SetRelayOutputSettingsResponse }
     * 
     */
    public SetRelayOutputSettingsResponse createSetRelayOutputSettingsResponse() {
        return new SetRelayOutputSettingsResponse();
    }

    /**
     * Create an instance of {@link SetDynamicDNS }
     * 
     */
    public SetDynamicDNS createSetDynamicDNS() {
        return new SetDynamicDNS();
    }

    /**
     * Create an instance of {@link GetCertificateInformationResponse }
     * 
     */
    public GetCertificateInformationResponse createGetCertificateInformationResponse() {
        return new GetCertificateInformationResponse();
    }

    /**
     * Create an instance of {@link CertificateInformation }
     * 
     */
    public CertificateInformation createCertificateInformation() {
        return new CertificateInformation();
    }

    /**
     * Create an instance of {@link GetEndpointReference }
     * 
     */
    public GetEndpointReference createGetEndpointReference() {
        return new GetEndpointReference();
    }

    /**
     * Create an instance of {@link GetWsdlUrlResponse }
     * 
     */
    public GetWsdlUrlResponse createGetWsdlUrlResponse() {
        return new GetWsdlUrlResponse();
    }

    /**
     * Create an instance of {@link SetCertificatesStatus }
     * 
     */
    public SetCertificatesStatus createSetCertificatesStatus() {
        return new SetCertificatesStatus();
    }

    /**
     * Create an instance of {@link CertificateStatus }
     * 
     */
    public CertificateStatus createCertificateStatus() {
        return new CertificateStatus();
    }

    /**
     * Create an instance of {@link GetDot1XConfiguration }
     * 
     */
    public GetDot1XConfiguration createGetDot1XConfiguration() {
        return new GetDot1XConfiguration();
    }

    /**
     * Create an instance of {@link LoadCACertificates }
     * 
     */
    public LoadCACertificates createLoadCACertificates() {
        return new LoadCACertificates();
    }

    /**
     * Create an instance of {@link SetIPAddressFilterResponse }
     * 
     */
    public SetIPAddressFilterResponse createSetIPAddressFilterResponse() {
        return new SetIPAddressFilterResponse();
    }

    /**
     * Create an instance of {@link DeleteDot1XConfigurationResponse }
     * 
     */
    public DeleteDot1XConfigurationResponse createDeleteDot1XConfigurationResponse() {
        return new DeleteDot1XConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetDot11CapabilitiesResponse }
     * 
     */
    public GetDot11CapabilitiesResponse createGetDot11CapabilitiesResponse() {
        return new GetDot11CapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Dot11Capabilities }
     * 
     */
    public Dot11Capabilities createDot11Capabilities() {
        return new Dot11Capabilities();
    }

    /**
     * Create an instance of {@link RemoveScopesResponse }
     * 
     */
    public RemoveScopesResponse createRemoveScopesResponse() {
        return new RemoveScopesResponse();
    }

    /**
     * Create an instance of {@link GetDPAddressesResponse }
     * 
     */
    public GetDPAddressesResponse createGetDPAddressesResponse() {
        return new GetDPAddressesResponse();
    }

    /**
     * Create an instance of {@link NetworkHost }
     * 
     */
    public NetworkHost createNetworkHost() {
        return new NetworkHost();
    }

    /**
     * Create an instance of {@link CreateStorageConfiguration }
     * 
     */
    public CreateStorageConfiguration createCreateStorageConfiguration() {
        return new CreateStorageConfiguration();
    }

    /**
     * Create an instance of {@link GetDot1XConfigurationResponse }
     * 
     */
    public GetDot1XConfigurationResponse createGetDot1XConfigurationResponse() {
        return new GetDot1XConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetDot1XConfiguration }
     * 
     */
    public SetDot1XConfiguration createSetDot1XConfiguration() {
        return new SetDot1XConfiguration();
    }

    /**
     * Create an instance of {@link GetRemoteDiscoveryModeResponse }
     * 
     */
    public GetRemoteDiscoveryModeResponse createGetRemoteDiscoveryModeResponse() {
        return new GetRemoteDiscoveryModeResponse();
    }

    /**
     * Create an instance of {@link SetNetworkProtocolsResponse }
     * 
     */
    public SetNetworkProtocolsResponse createSetNetworkProtocolsResponse() {
        return new SetNetworkProtocolsResponse();
    }

    /**
     * Create an instance of {@link GetCertificateInformation }
     * 
     */
    public GetCertificateInformation createGetCertificateInformation() {
        return new GetCertificateInformation();
    }

    /**
     * Create an instance of {@link GetRemoteDiscoveryMode }
     * 
     */
    public GetRemoteDiscoveryMode createGetRemoteDiscoveryMode() {
        return new GetRemoteDiscoveryMode();
    }

    /**
     * Create an instance of {@link GetSystemSupportInformationResponse }
     * 
     */
    public GetSystemSupportInformationResponse createGetSystemSupportInformationResponse() {
        return new GetSystemSupportInformationResponse();
    }

    /**
     * Create an instance of {@link SupportInformation }
     * 
     */
    public SupportInformation createSupportInformation() {
        return new SupportInformation();
    }

    /**
     * Create an instance of {@link RestoreSystem }
     * 
     */
    public RestoreSystem createRestoreSystem() {
        return new RestoreSystem();
    }

    /**
     * Create an instance of {@link BackupFile }
     * 
     */
    public BackupFile createBackupFile() {
        return new BackupFile();
    }

    /**
     * Create an instance of {@link SetNetworkInterfacesResponse }
     * 
     */
    public SetNetworkInterfacesResponse createSetNetworkInterfacesResponse() {
        return new SetNetworkInterfacesResponse();
    }

    /**
     * Create an instance of {@link GetRelayOutputs }
     * 
     */
    public GetRelayOutputs createGetRelayOutputs() {
        return new GetRelayOutputs();
    }

    /**
     * Create an instance of {@link DeleteDot1XConfiguration }
     * 
     */
    public DeleteDot1XConfiguration createDeleteDot1XConfiguration() {
        return new DeleteDot1XConfiguration();
    }

    /**
     * Create an instance of {@link StartFirmwareUpgradeResponse }
     * 
     */
    public StartFirmwareUpgradeResponse createStartFirmwareUpgradeResponse() {
        return new StartFirmwareUpgradeResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link SetDot1XConfigurationResponse }
     * 
     */
    public SetDot1XConfigurationResponse createSetDot1XConfigurationResponse() {
        return new SetDot1XConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetCertificatesStatus }
     * 
     */
    public GetCertificatesStatus createGetCertificatesStatus() {
        return new GetCertificatesStatus();
    }

    /**
     * Create an instance of {@link GetPkcs10Request }
     * 
     */
    public GetPkcs10Request createGetPkcs10Request() {
        return new GetPkcs10Request();
    }

    /**
     * Create an instance of {@link GetDeviceInformationResponse }
     * 
     */
    public GetDeviceInformationResponse createGetDeviceInformationResponse() {
        return new GetDeviceInformationResponse();
    }

    /**
     * Create an instance of {@link SendAuxiliaryCommand }
     * 
     */
    public SendAuxiliaryCommand createSendAuxiliaryCommand() {
        return new SendAuxiliaryCommand();
    }

    /**
     * Create an instance of {@link SetClientCertificateModeResponse }
     * 
     */
    public SetClientCertificateModeResponse createSetClientCertificateModeResponse() {
        return new SetClientCertificateModeResponse();
    }

    /**
     * Create an instance of {@link GetServicesResponse }
     * 
     */
    public GetServicesResponse createGetServicesResponse() {
        return new GetServicesResponse();
    }

    /**
     * Create an instance of {@link GetDPAddresses }
     * 
     */
    public GetDPAddresses createGetDPAddresses() {
        return new GetDPAddresses();
    }

    /**
     * Create an instance of {@link GetStorageConfigurationsResponse }
     * 
     */
    public GetStorageConfigurationsResponse createGetStorageConfigurationsResponse() {
        return new GetStorageConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetSystemLog }
     * 
     */
    public GetSystemLog createGetSystemLog() {
        return new GetSystemLog();
    }

    /**
     * Create an instance of {@link CreateStorageConfigurationResponse }
     * 
     */
    public CreateStorageConfigurationResponse createCreateStorageConfigurationResponse() {
        return new CreateStorageConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetRelayOutputsResponse }
     * 
     */
    public GetRelayOutputsResponse createGetRelayOutputsResponse() {
        return new GetRelayOutputsResponse();
    }

    /**
     * Create an instance of {@link RelayOutput }
     * 
     */
    public RelayOutput createRelayOutput() {
        return new RelayOutput();
    }

    /**
     * Create an instance of {@link GetNetworkDefaultGatewayResponse }
     * 
     */
    public GetNetworkDefaultGatewayResponse createGetNetworkDefaultGatewayResponse() {
        return new GetNetworkDefaultGatewayResponse();
    }

    /**
     * Create an instance of {@link NetworkGateway }
     * 
     */
    public NetworkGateway createNetworkGateway() {
        return new NetworkGateway();
    }

    /**
     * Create an instance of {@link GetStorageConfigurations }
     * 
     */
    public GetStorageConfigurations createGetStorageConfigurations() {
        return new GetStorageConfigurations();
    }

    /**
     * Create an instance of {@link SetHostnameFromDHCP }
     * 
     */
    public SetHostnameFromDHCP createSetHostnameFromDHCP() {
        return new SetHostnameFromDHCP();
    }

    /**
     * Create an instance of {@link SetNetworkDefaultGateway }
     * 
     */
    public SetNetworkDefaultGateway createSetNetworkDefaultGateway() {
        return new SetNetworkDefaultGateway();
    }

    /**
     * Create an instance of {@link GetDot11StatusResponse }
     * 
     */
    public GetDot11StatusResponse createGetDot11StatusResponse() {
        return new GetDot11StatusResponse();
    }

    /**
     * Create an instance of {@link Dot11Status }
     * 
     */
    public Dot11Status createDot11Status() {
        return new Dot11Status();
    }

    /**
     * Create an instance of {@link GetNetworkInterfaces }
     * 
     */
    public GetNetworkInterfaces createGetNetworkInterfaces() {
        return new GetNetworkInterfaces();
    }

    /**
     * Create an instance of {@link GetNetworkProtocolsResponse }
     * 
     */
    public GetNetworkProtocolsResponse createGetNetworkProtocolsResponse() {
        return new GetNetworkProtocolsResponse();
    }

    /**
     * Create an instance of {@link NetworkProtocol }
     * 
     */
    public NetworkProtocol createNetworkProtocol() {
        return new NetworkProtocol();
    }

    /**
     * Create an instance of {@link GetIPAddressFilter }
     * 
     */
    public GetIPAddressFilter createGetIPAddressFilter() {
        return new GetIPAddressFilter();
    }

    /**
     * Create an instance of {@link SetHostname }
     * 
     */
    public SetHostname createSetHostname() {
        return new SetHostname();
    }

    /**
     * Create an instance of {@link StartSystemRestore }
     * 
     */
    public StartSystemRestore createStartSystemRestore() {
        return new StartSystemRestore();
    }

    /**
     * Create an instance of {@link GetDot1XConfigurations }
     * 
     */
    public GetDot1XConfigurations createGetDot1XConfigurations() {
        return new GetDot1XConfigurations();
    }

    /**
     * Create an instance of {@link CreateDot1XConfiguration }
     * 
     */
    public CreateDot1XConfiguration createCreateDot1XConfiguration() {
        return new CreateDot1XConfiguration();
    }

    /**
     * Create an instance of {@link SetSystemDateAndTime }
     * 
     */
    public SetSystemDateAndTime createSetSystemDateAndTime() {
        return new SetSystemDateAndTime();
    }

    /**
     * Create an instance of {@link TimeZone }
     * 
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link GetEndpointReferenceResponse }
     * 
     */
    public GetEndpointReferenceResponse createGetEndpointReferenceResponse() {
        return new GetEndpointReferenceResponse();
    }

    /**
     * Create an instance of {@link RemoveIPAddressFilter }
     * 
     */
    public RemoveIPAddressFilter createRemoveIPAddressFilter() {
        return new RemoveIPAddressFilter();
    }

    /**
     * Create an instance of {@link IPAddressFilter }
     * 
     */
    public IPAddressFilter createIPAddressFilter() {
        return new IPAddressFilter();
    }

    /**
     * Create an instance of {@link GetSystemSupportInformation }
     * 
     */
    public GetSystemSupportInformation createGetSystemSupportInformation() {
        return new GetSystemSupportInformation();
    }

    /**
     * Create an instance of {@link StartSystemRestoreResponse }
     * 
     */
    public StartSystemRestoreResponse createStartSystemRestoreResponse() {
        return new StartSystemRestoreResponse();
    }

    /**
     * Create an instance of {@link CreateCertificate }
     * 
     */
    public CreateCertificate createCreateCertificate() {
        return new CreateCertificate();
    }

    /**
     * Create an instance of {@link SetDiscoveryMode }
     * 
     */
    public SetDiscoveryMode createSetDiscoveryMode() {
        return new SetDiscoveryMode();
    }

    /**
     * Create an instance of {@link GetDynamicDNS }
     * 
     */
    public GetDynamicDNS createGetDynamicDNS() {
        return new GetDynamicDNS();
    }

    /**
     * Create an instance of {@link SetGeoLocationResponse }
     * 
     */
    public SetGeoLocationResponse createSetGeoLocationResponse() {
        return new SetGeoLocationResponse();
    }

    /**
     * Create an instance of {@link RemoveScopes }
     * 
     */
    public RemoveScopes createRemoveScopes() {
        return new RemoveScopes();
    }

    /**
     * Create an instance of {@link SetRelayOutputStateResponse }
     * 
     */
    public SetRelayOutputStateResponse createSetRelayOutputStateResponse() {
        return new SetRelayOutputStateResponse();
    }

    /**
     * Create an instance of {@link GetCACertificatesResponse }
     * 
     */
    public GetCACertificatesResponse createGetCACertificatesResponse() {
        return new GetCACertificatesResponse();
    }

    /**
     * Create an instance of {@link SetUser }
     * 
     */
    public SetUser createSetUser() {
        return new SetUser();
    }

    /**
     * Create an instance of {@link RemoveIPAddressFilterResponse }
     * 
     */
    public RemoveIPAddressFilterResponse createRemoveIPAddressFilterResponse() {
        return new RemoveIPAddressFilterResponse();
    }

    /**
     * Create an instance of {@link LoadCertificateWithPrivateKey }
     * 
     */
    public LoadCertificateWithPrivateKey createLoadCertificateWithPrivateKey() {
        return new LoadCertificateWithPrivateKey();
    }

    /**
     * Create an instance of {@link CertificateWithPrivateKey }
     * 
     */
    public CertificateWithPrivateKey createCertificateWithPrivateKey() {
        return new CertificateWithPrivateKey();
    }

    /**
     * Create an instance of {@link SetCertificatesStatusResponse }
     * 
     */
    public SetCertificatesStatusResponse createSetCertificatesStatusResponse() {
        return new SetCertificatesStatusResponse();
    }

    /**
     * Create an instance of {@link SetSystemDateAndTimeResponse }
     * 
     */
    public SetSystemDateAndTimeResponse createSetSystemDateAndTimeResponse() {
        return new SetSystemDateAndTimeResponse();
    }

    /**
     * Create an instance of {@link SetDPAddresses }
     * 
     */
    public SetDPAddresses createSetDPAddresses() {
        return new SetDPAddresses();
    }

    /**
     * Create an instance of {@link SetNetworkInterfaces }
     * 
     */
    public SetNetworkInterfaces createSetNetworkInterfaces() {
        return new SetNetworkInterfaces();
    }

    /**
     * Create an instance of {@link NetworkInterfaceSetConfiguration }
     * 
     */
    public NetworkInterfaceSetConfiguration createNetworkInterfaceSetConfiguration() {
        return new NetworkInterfaceSetConfiguration();
    }

    /**
     * Create an instance of {@link SetDPAddressesResponse }
     * 
     */
    public SetDPAddressesResponse createSetDPAddressesResponse() {
        return new SetDPAddressesResponse();
    }

    /**
     * Create an instance of {@link GetSystemDateAndTime }
     * 
     */
    public GetSystemDateAndTime createGetSystemDateAndTime() {
        return new GetSystemDateAndTime();
    }

    /**
     * Create an instance of {@link SetAccessPolicyResponse }
     * 
     */
    public SetAccessPolicyResponse createSetAccessPolicyResponse() {
        return new SetAccessPolicyResponse();
    }

    /**
     * Create an instance of {@link SetNTP }
     * 
     */
    public SetNTP createSetNTP() {
        return new SetNTP();
    }

    /**
     * Create an instance of {@link GetNetworkInterfacesResponse }
     * 
     */
    public GetNetworkInterfacesResponse createGetNetworkInterfacesResponse() {
        return new GetNetworkInterfacesResponse();
    }

    /**
     * Create an instance of {@link NetworkInterface }
     * 
     */
    public NetworkInterface createNetworkInterface() {
        return new NetworkInterface();
    }

    /**
     * Create an instance of {@link GetDiscoveryModeResponse }
     * 
     */
    public GetDiscoveryModeResponse createGetDiscoveryModeResponse() {
        return new GetDiscoveryModeResponse();
    }

    /**
     * Create an instance of {@link GetIPAddressFilterResponse }
     * 
     */
    public GetIPAddressFilterResponse createGetIPAddressFilterResponse() {
        return new GetIPAddressFilterResponse();
    }

    /**
     * Create an instance of {@link GetClientCertificateMode }
     * 
     */
    public GetClientCertificateMode createGetClientCertificateMode() {
        return new GetClientCertificateMode();
    }

    /**
     * Create an instance of {@link GetDynamicDNSResponse }
     * 
     */
    public GetDynamicDNSResponse createGetDynamicDNSResponse() {
        return new GetDynamicDNSResponse();
    }

    /**
     * Create an instance of {@link DynamicDNSInformation }
     * 
     */
    public DynamicDNSInformation createDynamicDNSInformation() {
        return new DynamicDNSInformation();
    }

    /**
     * Create an instance of {@link GetZeroConfiguration }
     * 
     */
    public GetZeroConfiguration createGetZeroConfiguration() {
        return new GetZeroConfiguration();
    }

    /**
     * Create an instance of {@link SetNetworkDefaultGatewayResponse }
     * 
     */
    public SetNetworkDefaultGatewayResponse createSetNetworkDefaultGatewayResponse() {
        return new SetNetworkDefaultGatewayResponse();
    }

    /**
     * Create an instance of {@link StartFirmwareUpgrade }
     * 
     */
    public StartFirmwareUpgrade createStartFirmwareUpgrade() {
        return new StartFirmwareUpgrade();
    }

    /**
     * Create an instance of {@link GetNTP }
     * 
     */
    public GetNTP createGetNTP() {
        return new GetNTP();
    }

    /**
     * Create an instance of {@link UpgradeSystemFirmwareResponse }
     * 
     */
    public UpgradeSystemFirmwareResponse createUpgradeSystemFirmwareResponse() {
        return new UpgradeSystemFirmwareResponse();
    }

    /**
     * Create an instance of {@link DeleteStorageConfiguration }
     * 
     */
    public DeleteStorageConfiguration createDeleteStorageConfiguration() {
        return new DeleteStorageConfiguration();
    }

    /**
     * Create an instance of {@link GetWsdlUrl }
     * 
     */
    public GetWsdlUrl createGetWsdlUrl() {
        return new GetWsdlUrl();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link LoadCACertificatesResponse }
     * 
     */
    public LoadCACertificatesResponse createLoadCACertificatesResponse() {
        return new LoadCACertificatesResponse();
    }

    /**
     * Create an instance of {@link DeleteStorageConfigurationResponse }
     * 
     */
    public DeleteStorageConfigurationResponse createDeleteStorageConfigurationResponse() {
        return new DeleteStorageConfigurationResponse();
    }

    /**
     * Create an instance of {@link SendAuxiliaryCommandResponse }
     * 
     */
    public SendAuxiliaryCommandResponse createSendAuxiliaryCommandResponse() {
        return new SendAuxiliaryCommandResponse();
    }

    /**
     * Create an instance of {@link GetCapabilitiesResponse }
     * 
     */
    public GetCapabilitiesResponse createGetCapabilitiesResponse() {
        return new GetCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link bee.generated.client.Capabilities }
     * 
     */
    public bee.generated.client.Capabilities createCapabilities() {
        return new bee.generated.client.Capabilities();
    }

    /**
     * Create an instance of {@link GetServices }
     * 
     */
    public GetServices createGetServices() {
        return new GetServices();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link DeviceServiceCapabilities }
     * 
     */
    public DeviceServiceCapabilities createDeviceServiceCapabilities() {
        return new DeviceServiceCapabilities();
    }

    /**
     * Create an instance of {@link CreateDot1XConfigurationResponse }
     * 
     */
    public CreateDot1XConfigurationResponse createCreateDot1XConfigurationResponse() {
        return new CreateDot1XConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetZeroConfiguration }
     * 
     */
    public SetZeroConfiguration createSetZeroConfiguration() {
        return new SetZeroConfiguration();
    }

    /**
     * Create an instance of {@link GetDot11Status }
     * 
     */
    public GetDot11Status createGetDot11Status() {
        return new GetDot11Status();
    }

    /**
     * Create an instance of {@link CreateCertificateResponse }
     * 
     */
    public CreateCertificateResponse createCreateCertificateResponse() {
        return new CreateCertificateResponse();
    }

    /**
     * Create an instance of {@link GetScopesResponse }
     * 
     */
    public GetScopesResponse createGetScopesResponse() {
        return new GetScopesResponse();
    }

    /**
     * Create an instance of {@link Scope }
     * 
     */
    public Scope createScope() {
        return new Scope();
    }

    /**
     * Create an instance of {@link SetRemoteDiscoveryModeResponse }
     * 
     */
    public SetRemoteDiscoveryModeResponse createSetRemoteDiscoveryModeResponse() {
        return new SetRemoteDiscoveryModeResponse();
    }

    /**
     * Create an instance of {@link SetGeoLocation }
     * 
     */
    public SetGeoLocation createSetGeoLocation() {
        return new SetGeoLocation();
    }

    /**
     * Create an instance of {@link GetCapabilities }
     * 
     */
    public GetCapabilities createGetCapabilities() {
        return new GetCapabilities();
    }

    /**
     * Create an instance of {@link GetStorageConfigurationResponse }
     * 
     */
    public GetStorageConfigurationResponse createGetStorageConfigurationResponse() {
        return new GetStorageConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetStorageConfiguration }
     * 
     */
    public GetStorageConfiguration createGetStorageConfiguration() {
        return new GetStorageConfiguration();
    }

    /**
     * Create an instance of {@link SetNetworkProtocols }
     * 
     */
    public SetNetworkProtocols createSetNetworkProtocols() {
        return new SetNetworkProtocols();
    }

    /**
     * Create an instance of {@link GetNetworkProtocols }
     * 
     */
    public GetNetworkProtocols createGetNetworkProtocols() {
        return new GetNetworkProtocols();
    }

    /**
     * Create an instance of {@link GetNTPResponse }
     * 
     */
    public GetNTPResponse createGetNTPResponse() {
        return new GetNTPResponse();
    }

    /**
     * Create an instance of {@link NTPInformation }
     * 
     */
    public NTPInformation createNTPInformation() {
        return new NTPInformation();
    }

    /**
     * Create an instance of {@link LoadCertificateWithPrivateKeyResponse }
     * 
     */
    public LoadCertificateWithPrivateKeyResponse createLoadCertificateWithPrivateKeyResponse() {
        return new LoadCertificateWithPrivateKeyResponse();
    }

    /**
     * Create an instance of {@link SetIPAddressFilter }
     * 
     */
    public SetIPAddressFilter createSetIPAddressFilter() {
        return new SetIPAddressFilter();
    }

    /**
     * Create an instance of {@link GetDNSResponse }
     * 
     */
    public GetDNSResponse createGetDNSResponse() {
        return new GetDNSResponse();
    }

    /**
     * Create an instance of {@link DNSInformation }
     * 
     */
    public DNSInformation createDNSInformation() {
        return new DNSInformation();
    }

    /**
     * Create an instance of {@link GetGeoLocation }
     * 
     */
    public GetGeoLocation createGetGeoLocation() {
        return new GetGeoLocation();
    }

    /**
     * Create an instance of {@link SetDNS }
     * 
     */
    public SetDNS createSetDNS() {
        return new SetDNS();
    }

    /**
     * Create an instance of {@link IPAddress }
     * 
     */
    public IPAddress createIPAddress() {
        return new IPAddress();
    }

    /**
     * Create an instance of {@link SetRemoteUserResponse }
     * 
     */
    public SetRemoteUserResponse createSetRemoteUserResponse() {
        return new SetRemoteUserResponse();
    }

    /**
     * Create an instance of {@link GetHostname }
     * 
     */
    public GetHostname createGetHostname() {
        return new GetHostname();
    }

    /**
     * Create an instance of {@link SetDynamicDNSResponse }
     * 
     */
    public SetDynamicDNSResponse createSetDynamicDNSResponse() {
        return new SetDynamicDNSResponse();
    }

    /**
     * Create an instance of {@link GetAccessPolicyResponse }
     * 
     */
    public GetAccessPolicyResponse createGetAccessPolicyResponse() {
        return new GetAccessPolicyResponse();
    }

    /**
     * Create an instance of {@link SystemReboot }
     * 
     */
    public SystemReboot createSystemReboot() {
        return new SystemReboot();
    }

    /**
     * Create an instance of {@link AddIPAddressFilter }
     * 
     */
    public AddIPAddressFilter createAddIPAddressFilter() {
        return new AddIPAddressFilter();
    }

    /**
     * Create an instance of {@link GetSystemDateAndTimeResponse }
     * 
     */
    public GetSystemDateAndTimeResponse createGetSystemDateAndTimeResponse() {
        return new GetSystemDateAndTimeResponse();
    }

    /**
     * Create an instance of {@link SystemDateTime }
     * 
     */
    public SystemDateTime createSystemDateTime() {
        return new SystemDateTime();
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link SetStorageConfigurationResponse }
     * 
     */
    public SetStorageConfigurationResponse createSetStorageConfigurationResponse() {
        return new SetStorageConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetSystemBackupResponse }
     * 
     */
    public GetSystemBackupResponse createGetSystemBackupResponse() {
        return new GetSystemBackupResponse();
    }

    /**
     * Create an instance of {@link GetRemoteUser }
     * 
     */
    public GetRemoteUser createGetRemoteUser() {
        return new GetRemoteUser();
    }

    /**
     * Create an instance of {@link SetZeroConfigurationResponse }
     * 
     */
    public SetZeroConfigurationResponse createSetZeroConfigurationResponse() {
        return new SetZeroConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetRelayOutputState }
     * 
     */
    public SetRelayOutputState createSetRelayOutputState() {
        return new SetRelayOutputState();
    }

    /**
     * Create an instance of {@link SystemRebootResponse }
     * 
     */
    public SystemRebootResponse createSystemRebootResponse() {
        return new SystemRebootResponse();
    }

    /**
     * Create an instance of {@link CreateUsersResponse }
     * 
     */
    public CreateUsersResponse createCreateUsersResponse() {
        return new CreateUsersResponse();
    }

    /**
     * Create an instance of {@link SetNTPResponse }
     * 
     */
    public SetNTPResponse createSetNTPResponse() {
        return new SetNTPResponse();
    }

    /**
     * Create an instance of {@link GetDNS }
     * 
     */
    public GetDNS createGetDNS() {
        return new GetDNS();
    }

    /**
     * Create an instance of {@link GetCertificatesStatusResponse }
     * 
     */
    public GetCertificatesStatusResponse createGetCertificatesStatusResponse() {
        return new GetCertificatesStatusResponse();
    }

    /**
     * Create an instance of {@link SystemCapabilities }
     * 
     */
    public SystemCapabilities createSystemCapabilities() {
        return new SystemCapabilities();
    }

    /**
     * Create an instance of {@link SecurityCapabilities }
     * 
     */
    public SecurityCapabilities createSecurityCapabilities() {
        return new SecurityCapabilities();
    }

    /**
     * Create an instance of {@link MiscCapabilities }
     * 
     */
    public MiscCapabilities createMiscCapabilities() {
        return new MiscCapabilities();
    }

    /**
     * Create an instance of {@link NetworkCapabilities }
     * 
     */
    public NetworkCapabilities createNetworkCapabilities() {
        return new NetworkCapabilities();
    }

    /**
     * Create an instance of {@link VideoAnalyticsConfiguration }
     * 
     */
    public VideoAnalyticsConfiguration createVideoAnalyticsConfiguration() {
        return new VideoAnalyticsConfiguration();
    }

    /**
     * Create an instance of {@link VideoSourceConfiguration }
     * 
     */
    public VideoSourceConfiguration createVideoSourceConfiguration() {
        return new VideoSourceConfiguration();
    }

    /**
     * Create an instance of {@link bee.generated.client.Message }
     * 
     */
    public bee.generated.client.Message createMessage() {
        return new bee.generated.client.Message();
    }

    /**
     * Create an instance of {@link MessageExtension }
     * 
     */
    public MessageExtension createMessageExtension() {
        return new MessageExtension();
    }

    /**
     * Create an instance of {@link AudioDecoderConfiguration }
     * 
     */
    public AudioDecoderConfiguration createAudioDecoderConfiguration() {
        return new AudioDecoderConfiguration();
    }

    /**
     * Create an instance of {@link AudioOutputConfiguration }
     * 
     */
    public AudioOutputConfiguration createAudioOutputConfiguration() {
        return new AudioOutputConfiguration();
    }

    /**
     * Create an instance of {@link Polyline }
     * 
     */
    public Polyline createPolyline() {
        return new Polyline();
    }

    /**
     * Create an instance of {@link MetadataConfiguration }
     * 
     */
    public MetadataConfiguration createMetadataConfiguration() {
        return new MetadataConfiguration();
    }

    /**
     * Create an instance of {@link AudioSourceConfiguration }
     * 
     */
    public AudioSourceConfiguration createAudioSourceConfiguration() {
        return new AudioSourceConfiguration();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link AudioEncoderConfiguration }
     * 
     */
    public AudioEncoderConfiguration createAudioEncoderConfiguration() {
        return new AudioEncoderConfiguration();
    }

    /**
     * Create an instance of {@link PTZConfiguration }
     * 
     */
    public PTZConfiguration createPTZConfiguration() {
        return new PTZConfiguration();
    }

    /**
     * Create an instance of {@link VideoEncoderConfiguration }
     * 
     */
    public VideoEncoderConfiguration createVideoEncoderConfiguration() {
        return new VideoEncoderConfiguration();
    }

    /**
     * Create an instance of {@link AudioClassDescriptorExtension }
     * 
     */
    public AudioClassDescriptorExtension createAudioClassDescriptorExtension() {
        return new AudioClassDescriptorExtension();
    }

    /**
     * Create an instance of {@link GeoOrientation }
     * 
     */
    public GeoOrientation createGeoOrientation() {
        return new GeoOrientation();
    }

    /**
     * Create an instance of {@link Dot11AvailableNetworksExtension }
     * 
     */
    public Dot11AvailableNetworksExtension createDot11AvailableNetworksExtension() {
        return new Dot11AvailableNetworksExtension();
    }

    /**
     * Create an instance of {@link SecurityCapabilities2 }
     * 
     */
    public SecurityCapabilities2 createSecurityCapabilities2() {
        return new SecurityCapabilities2();
    }

    /**
     * Create an instance of {@link MediaAttributes }
     * 
     */
    public MediaAttributes createMediaAttributes() {
        return new MediaAttributes();
    }

    /**
     * Create an instance of {@link NetworkInterfaceSetConfigurationExtension }
     * 
     */
    public NetworkInterfaceSetConfigurationExtension createNetworkInterfaceSetConfigurationExtension() {
        return new NetworkInterfaceSetConfigurationExtension();
    }

    /**
     * Create an instance of {@link RecordingJobStateInformation }
     * 
     */
    public RecordingJobStateInformation createRecordingJobStateInformation() {
        return new RecordingJobStateInformation();
    }

    /**
     * Create an instance of {@link LensProjection }
     * 
     */
    public LensProjection createLensProjection() {
        return new LensProjection();
    }

    /**
     * Create an instance of {@link FindMetadataResultList }
     * 
     */
    public FindMetadataResultList createFindMetadataResultList() {
        return new FindMetadataResultList();
    }

    /**
     * Create an instance of {@link PTZPresetTourPresetDetailOptionsExtension }
     * 
     */
    public PTZPresetTourPresetDetailOptionsExtension createPTZPresetTourPresetDetailOptionsExtension() {
        return new PTZPresetTourPresetDetailOptionsExtension();
    }

    /**
     * Create an instance of {@link SupportedRules }
     * 
     */
    public SupportedRules createSupportedRules() {
        return new SupportedRules();
    }

    /**
     * Create an instance of {@link NetworkHostExtension }
     * 
     */
    public NetworkHostExtension createNetworkHostExtension() {
        return new NetworkHostExtension();
    }

    /**
     * Create an instance of {@link Dot11PSKSet }
     * 
     */
    public Dot11PSKSet createDot11PSKSet() {
        return new Dot11PSKSet();
    }

    /**
     * Create an instance of {@link RecordingJobSourceExtension }
     * 
     */
    public RecordingJobSourceExtension createRecordingJobSourceExtension() {
        return new RecordingJobSourceExtension();
    }

    /**
     * Create an instance of {@link NetworkProtocolExtension }
     * 
     */
    public NetworkProtocolExtension createNetworkProtocolExtension() {
        return new NetworkProtocolExtension();
    }

    /**
     * Create an instance of {@link Dot3Configuration }
     * 
     */
    public Dot3Configuration createDot3Configuration() {
        return new Dot3Configuration();
    }

    /**
     * Create an instance of {@link AudioClassCandidate }
     * 
     */
    public AudioClassCandidate createAudioClassCandidate() {
        return new AudioClassCandidate();
    }

    /**
     * Create an instance of {@link OSDConfigurationExtension }
     * 
     */
    public OSDConfigurationExtension createOSDConfigurationExtension() {
        return new OSDConfigurationExtension();
    }

    /**
     * Create an instance of {@link FocusMove }
     * 
     */
    public FocusMove createFocusMove() {
        return new FocusMove();
    }

    /**
     * Create an instance of {@link Exposure }
     * 
     */
    public Exposure createExposure() {
        return new Exposure();
    }

    /**
     * Create an instance of {@link MetadataConfigurationOptionsExtension2 }
     * 
     */
    public MetadataConfigurationOptionsExtension2 createMetadataConfigurationOptionsExtension2() {
        return new MetadataConfigurationOptionsExtension2();
    }

    /**
     * Create an instance of {@link CapabilitiesExtension2 }
     * 
     */
    public CapabilitiesExtension2 createCapabilitiesExtension2() {
        return new CapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link IOCapabilities }
     * 
     */
    public IOCapabilities createIOCapabilities() {
        return new IOCapabilities();
    }

    /**
     * Create an instance of {@link AnalyticsStateInformation }
     * 
     */
    public AnalyticsStateInformation createAnalyticsStateInformation() {
        return new AnalyticsStateInformation();
    }

    /**
     * Create an instance of {@link PaneLayoutOptions }
     * 
     */
    public PaneLayoutOptions createPaneLayoutOptions() {
        return new PaneLayoutOptions();
    }

    /**
     * Create an instance of {@link OSDConfigurationOptions }
     * 
     */
    public OSDConfigurationOptions createOSDConfigurationOptions() {
        return new OSDConfigurationOptions();
    }

    /**
     * Create an instance of {@link CertificateUsage }
     * 
     */
    public CertificateUsage createCertificateUsage() {
        return new CertificateUsage();
    }

    /**
     * Create an instance of {@link WideDynamicRange20 }
     * 
     */
    public WideDynamicRange20 createWideDynamicRange20() {
        return new WideDynamicRange20();
    }

    /**
     * Create an instance of {@link VideoEncoderOptionsExtension2 }
     * 
     */
    public VideoEncoderOptionsExtension2 createVideoEncoderOptionsExtension2() {
        return new VideoEncoderOptionsExtension2();
    }

    /**
     * Create an instance of {@link PTZPresetTourSpotExtension }
     * 
     */
    public PTZPresetTourSpotExtension createPTZPresetTourSpotExtension() {
        return new PTZPresetTourSpotExtension();
    }

    /**
     * Create an instance of {@link EFlipOptionsExtension }
     * 
     */
    public EFlipOptionsExtension createEFlipOptionsExtension() {
        return new EFlipOptionsExtension();
    }

    /**
     * Create an instance of {@link PTZFilter }
     * 
     */
    public PTZFilter createPTZFilter() {
        return new PTZFilter();
    }

    /**
     * Create an instance of {@link OSDTextOptions }
     * 
     */
    public OSDTextOptions createOSDTextOptions() {
        return new OSDTextOptions();
    }

    /**
     * Create an instance of {@link BacklightCompensationOptions20 }
     * 
     */
    public BacklightCompensationOptions20 createBacklightCompensationOptions20() {
        return new BacklightCompensationOptions20();
    }

    /**
     * Create an instance of {@link TrackAttributes }
     * 
     */
    public TrackAttributes createTrackAttributes() {
        return new TrackAttributes();
    }

    /**
     * Create an instance of {@link EFlipOptions }
     * 
     */
    public EFlipOptions createEFlipOptions() {
        return new EFlipOptions();
    }

    /**
     * Create an instance of {@link MotionExpression }
     * 
     */
    public MotionExpression createMotionExpression() {
        return new MotionExpression();
    }

    /**
     * Create an instance of {@link BacklightCompensation20 }
     * 
     */
    public BacklightCompensation20 createBacklightCompensation20() {
        return new BacklightCompensation20();
    }

    /**
     * Create an instance of {@link ProfileExtension }
     * 
     */
    public ProfileExtension createProfileExtension() {
        return new ProfileExtension();
    }

    /**
     * Create an instance of {@link VideoOutputConfigurationOptions }
     * 
     */
    public VideoOutputConfigurationOptions createVideoOutputConfigurationOptions() {
        return new VideoOutputConfigurationOptions();
    }

    /**
     * Create an instance of {@link SceneOrientation }
     * 
     */
    public SceneOrientation createSceneOrientation() {
        return new SceneOrientation();
    }

    /**
     * Create an instance of {@link AnalyticsEngineConfiguration }
     * 
     */
    public AnalyticsEngineConfiguration createAnalyticsEngineConfiguration() {
        return new AnalyticsEngineConfiguration();
    }

    /**
     * Create an instance of {@link PTZPresetTourPresetDetail }
     * 
     */
    public PTZPresetTourPresetDetail createPTZPresetTourPresetDetail() {
        return new PTZPresetTourPresetDetail();
    }

    /**
     * Create an instance of {@link OSDImgOptions }
     * 
     */
    public OSDImgOptions createOSDImgOptions() {
        return new OSDImgOptions();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationExtension2 }
     * 
     */
    public VideoSourceConfigurationExtension2 createVideoSourceConfigurationExtension2() {
        return new VideoSourceConfigurationExtension2();
    }

    /**
     * Create an instance of {@link IPv6NetworkInterface }
     * 
     */
    public IPv6NetworkInterface createIPv6NetworkInterface() {
        return new IPv6NetworkInterface();
    }

    /**
     * Create an instance of {@link EventFilter }
     * 
     */
    public EventFilter createEventFilter() {
        return new EventFilter();
    }

    /**
     * Create an instance of {@link NoiseReduction }
     * 
     */
    public NoiseReduction createNoiseReduction() {
        return new NoiseReduction();
    }

    /**
     * Create an instance of {@link VideoEncoderConfigurationOptions }
     * 
     */
    public VideoEncoderConfigurationOptions createVideoEncoderConfigurationOptions() {
        return new VideoEncoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link FindMetadataResult }
     * 
     */
    public FindMetadataResult createFindMetadataResult() {
        return new FindMetadataResult();
    }

    /**
     * Create an instance of {@link Layout }
     * 
     */
    public Layout createLayout() {
        return new Layout();
    }

    /**
     * Create an instance of {@link PTZPresetTourTypeExtension }
     * 
     */
    public PTZPresetTourTypeExtension createPTZPresetTourTypeExtension() {
        return new PTZPresetTourTypeExtension();
    }

    /**
     * Create an instance of {@link SecurityCapabilitiesExtension }
     * 
     */
    public SecurityCapabilitiesExtension createSecurityCapabilitiesExtension() {
        return new SecurityCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link ImagingOptions }
     * 
     */
    public ImagingOptions createImagingOptions() {
        return new ImagingOptions();
    }

    /**
     * Create an instance of {@link ProfileCapabilities }
     * 
     */
    public ProfileCapabilities createProfileCapabilities() {
        return new ProfileCapabilities();
    }

    /**
     * Create an instance of {@link Space2DDescription }
     * 
     */
    public Space2DDescription createSpace2DDescription() {
        return new Space2DDescription();
    }

    /**
     * Create an instance of {@link AnyHolder }
     * 
     */
    public AnyHolder createAnyHolder() {
        return new AnyHolder();
    }

    /**
     * Create an instance of {@link LayoutOptionsExtension }
     * 
     */
    public LayoutOptionsExtension createLayoutOptionsExtension() {
        return new LayoutOptionsExtension();
    }

    /**
     * Create an instance of {@link ImageStabilization }
     * 
     */
    public ImageStabilization createImageStabilization() {
        return new ImageStabilization();
    }

    /**
     * Create an instance of {@link ImagingStatus }
     * 
     */
    public ImagingStatus createImagingStatus() {
        return new ImagingStatus();
    }

    /**
     * Create an instance of {@link AudioDecoderConfigurationOptions }
     * 
     */
    public AudioDecoderConfigurationOptions createAudioDecoderConfigurationOptions() {
        return new AudioDecoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link CodingCapabilities }
     * 
     */
    public CodingCapabilities createCodingCapabilities() {
        return new CodingCapabilities();
    }

    /**
     * Create an instance of {@link AudioEncoderConfigurationOptions }
     * 
     */
    public AudioEncoderConfigurationOptions createAudioEncoderConfigurationOptions() {
        return new AudioEncoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link RecordingCapabilities }
     * 
     */
    public RecordingCapabilities createRecordingCapabilities() {
        return new RecordingCapabilities();
    }

    /**
     * Create an instance of {@link WideDynamicRangeOptions }
     * 
     */
    public WideDynamicRangeOptions createWideDynamicRangeOptions() {
        return new WideDynamicRangeOptions();
    }

    /**
     * Create an instance of {@link G726DecOptions }
     * 
     */
    public G726DecOptions createG726DecOptions() {
        return new G726DecOptions();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustment }
     * 
     */
    public IrCutFilterAutoAdjustment createIrCutFilterAutoAdjustment() {
        return new IrCutFilterAutoAdjustment();
    }

    /**
     * Create an instance of {@link WhiteBalanceOptions20Extension }
     * 
     */
    public WhiteBalanceOptions20Extension createWhiteBalanceOptions20Extension() {
        return new WhiteBalanceOptions20Extension();
    }

    /**
     * Create an instance of {@link LensDescription }
     * 
     */
    public LensDescription createLensDescription() {
        return new LensDescription();
    }

    /**
     * Create an instance of {@link Color }
     * 
     */
    public Color createColor() {
        return new Color();
    }

    /**
     * Create an instance of {@link DurationRange }
     * 
     */
    public DurationRange createDurationRange() {
        return new DurationRange();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingConditionOptions }
     * 
     */
    public PTZPresetTourStartingConditionOptions createPTZPresetTourStartingConditionOptions() {
        return new PTZPresetTourStartingConditionOptions();
    }

    /**
     * Create an instance of {@link FocusStatus }
     * 
     */
    public FocusStatus createFocusStatus() {
        return new FocusStatus();
    }

    /**
     * Create an instance of {@link IPv4NetworkInterfaceSetConfiguration }
     * 
     */
    public IPv4NetworkInterfaceSetConfiguration createIPv4NetworkInterfaceSetConfiguration() {
        return new IPv4NetworkInterfaceSetConfiguration();
    }

    /**
     * Create an instance of {@link PTZPresetTourExtension }
     * 
     */
    public PTZPresetTourExtension createPTZPresetTourExtension() {
        return new PTZPresetTourExtension();
    }

    /**
     * Create an instance of {@link FocusConfiguration }
     * 
     */
    public FocusConfiguration createFocusConfiguration() {
        return new FocusConfiguration();
    }

    /**
     * Create an instance of {@link FindPTZPositionResult }
     * 
     */
    public FindPTZPositionResult createFindPTZPositionResult() {
        return new FindPTZPositionResult();
    }

    /**
     * Create an instance of {@link OSDTextConfigurationExtension }
     * 
     */
    public OSDTextConfigurationExtension createOSDTextConfigurationExtension() {
        return new OSDTextConfigurationExtension();
    }

    /**
     * Create an instance of {@link UserExtension }
     * 
     */
    public UserExtension createUserExtension() {
        return new UserExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourSpot }
     * 
     */
    public PTZPresetTourSpot createPTZPresetTourSpot() {
        return new PTZPresetTourSpot();
    }

    /**
     * Create an instance of {@link DefoggingOptions }
     * 
     */
    public DefoggingOptions createDefoggingOptions() {
        return new DefoggingOptions();
    }

    /**
     * Create an instance of {@link Exposure20 }
     * 
     */
    public Exposure20 createExposure20() {
        return new Exposure20();
    }

    /**
     * Create an instance of {@link AnalyticsEngine }
     * 
     */
    public AnalyticsEngine createAnalyticsEngine() {
        return new AnalyticsEngine();
    }

    /**
     * Create an instance of {@link LayoutOptions }
     * 
     */
    public LayoutOptions createLayoutOptions() {
        return new LayoutOptions();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationExtension }
     * 
     */
    public VideoSourceConfigurationExtension createVideoSourceConfigurationExtension() {
        return new VideoSourceConfigurationExtension();
    }

    /**
     * Create an instance of {@link LensOffset }
     * 
     */
    public LensOffset createLensOffset() {
        return new LensOffset();
    }

    /**
     * Create an instance of {@link GetTracksResponseList }
     * 
     */
    public GetTracksResponseList createGetTracksResponseList() {
        return new GetTracksResponseList();
    }

    /**
     * Create an instance of {@link ReverseOptionsExtension }
     * 
     */
    public ReverseOptionsExtension createReverseOptionsExtension() {
        return new ReverseOptionsExtension();
    }

    /**
     * Create an instance of {@link PolygonConfiguration }
     * 
     */
    public PolygonConfiguration createPolygonConfiguration() {
        return new PolygonConfiguration();
    }

    /**
     * Create an instance of {@link LayoutExtension }
     * 
     */
    public LayoutExtension createLayoutExtension() {
        return new LayoutExtension();
    }

    /**
     * Create an instance of {@link RecordingJobStateTracks }
     * 
     */
    public RecordingJobStateTracks createRecordingJobStateTracks() {
        return new RecordingJobStateTracks();
    }

    /**
     * Create an instance of {@link MetadataInputExtension }
     * 
     */
    public MetadataInputExtension createMetadataInputExtension() {
        return new MetadataInputExtension();
    }

    /**
     * Create an instance of {@link Dot11PSKSetExtension }
     * 
     */
    public Dot11PSKSetExtension createDot11PSKSetExtension() {
        return new Dot11PSKSetExtension();
    }

    /**
     * Create an instance of {@link DigitalInput }
     * 
     */
    public DigitalInput createDigitalInput() {
        return new DigitalInput();
    }

    /**
     * Create an instance of {@link AudioSourceConfigurationOptions }
     * 
     */
    public AudioSourceConfigurationOptions createAudioSourceConfigurationOptions() {
        return new AudioSourceConfigurationOptions();
    }

    /**
     * Create an instance of {@link WhiteBalance }
     * 
     */
    public WhiteBalance createWhiteBalance() {
        return new WhiteBalance();
    }

    /**
     * Create an instance of {@link PTZPresetTourSupported }
     * 
     */
    public PTZPresetTourSupported createPTZPresetTourSupported() {
        return new PTZPresetTourSupported();
    }

    /**
     * Create an instance of {@link RecordingInformation }
     * 
     */
    public RecordingInformation createRecordingInformation() {
        return new RecordingInformation();
    }

    /**
     * Create an instance of {@link EAPMethodConfiguration }
     * 
     */
    public EAPMethodConfiguration createEAPMethodConfiguration() {
        return new EAPMethodConfiguration();
    }

    /**
     * Create an instance of {@link DeviceCapabilities }
     * 
     */
    public DeviceCapabilities createDeviceCapabilities() {
        return new DeviceCapabilities();
    }

    /**
     * Create an instance of {@link DateTimeRange }
     * 
     */
    public DateTimeRange createDateTimeRange() {
        return new DateTimeRange();
    }

    /**
     * Create an instance of {@link MotionExpressionConfiguration }
     * 
     */
    public MotionExpressionConfiguration createMotionExpressionConfiguration() {
        return new MotionExpressionConfiguration();
    }

    /**
     * Create an instance of {@link RecordingJobStateTrack }
     * 
     */
    public RecordingJobStateTrack createRecordingJobStateTrack() {
        return new RecordingJobStateTrack();
    }

    /**
     * Create an instance of {@link OSDImgConfiguration }
     * 
     */
    public OSDImgConfiguration createOSDImgConfiguration() {
        return new OSDImgConfiguration();
    }

    /**
     * Create an instance of {@link AnalyticsEngineControl }
     * 
     */
    public AnalyticsEngineControl createAnalyticsEngineControl() {
        return new AnalyticsEngineControl();
    }

    /**
     * Create an instance of {@link ImagingOptions20 }
     * 
     */
    public ImagingOptions20 createImagingOptions20() {
        return new ImagingOptions20();
    }

    /**
     * Create an instance of {@link SystemCapabilitiesExtension2 }
     * 
     */
    public SystemCapabilitiesExtension2 createSystemCapabilitiesExtension2() {
        return new SystemCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link NTPInformationExtension }
     * 
     */
    public NTPInformationExtension createNTPInformationExtension() {
        return new NTPInformationExtension();
    }

    /**
     * Create an instance of {@link TransformationExtension }
     * 
     */
    public TransformationExtension createTransformationExtension() {
        return new TransformationExtension();
    }

    /**
     * Create an instance of {@link NetworkCapabilities2 }
     * 
     */
    public NetworkCapabilities2 createNetworkCapabilities2() {
        return new NetworkCapabilities2();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingCondition }
     * 
     */
    public PTZPresetTourStartingCondition createPTZPresetTourStartingCondition() {
        return new PTZPresetTourStartingCondition();
    }

    /**
     * Create an instance of {@link JpegOptions2 }
     * 
     */
    public JpegOptions2 createJpegOptions2() {
        return new JpegOptions2();
    }

    /**
     * Create an instance of {@link SearchCapabilities }
     * 
     */
    public SearchCapabilities createSearchCapabilities() {
        return new SearchCapabilities();
    }

    /**
     * Create an instance of {@link PTZConfigurationExtension2 }
     * 
     */
    public PTZConfigurationExtension2 createPTZConfigurationExtension2() {
        return new PTZConfigurationExtension2();
    }

    /**
     * Create an instance of {@link RelativeFocusOptions }
     * 
     */
    public RelativeFocusOptions createRelativeFocusOptions() {
        return new RelativeFocusOptions();
    }

    /**
     * Create an instance of {@link PTZNodeExtension2 }
     * 
     */
    public PTZNodeExtension2 createPTZNodeExtension2() {
        return new PTZNodeExtension2();
    }

    /**
     * Create an instance of {@link CapabilitiesExtension }
     * 
     */
    public CapabilitiesExtension createCapabilitiesExtension() {
        return new CapabilitiesExtension();
    }

    /**
     * Create an instance of {@link Dot1XConfigurationExtension }
     * 
     */
    public Dot1XConfigurationExtension createDot1XConfigurationExtension() {
        return new Dot1XConfigurationExtension();
    }

    /**
     * Create an instance of {@link VideoDecoderConfigurationOptions }
     * 
     */
    public VideoDecoderConfigurationOptions createVideoDecoderConfigurationOptions() {
        return new VideoDecoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link PTZPresetTourStatus }
     * 
     */
    public PTZPresetTourStatus createPTZPresetTourStatus() {
        return new PTZPresetTourStatus();
    }

    /**
     * Create an instance of {@link StreamSetup }
     * 
     */
    public StreamSetup createStreamSetup() {
        return new StreamSetup();
    }

    /**
     * Create an instance of {@link PTZPresetTourStatusExtension }
     * 
     */
    public PTZPresetTourStatusExtension createPTZPresetTourStatusExtension() {
        return new PTZPresetTourStatusExtension();
    }

    /**
     * Create an instance of {@link RelativeFocus }
     * 
     */
    public RelativeFocus createRelativeFocus() {
        return new RelativeFocus();
    }

    /**
     * Create an instance of {@link DeviceIOCapabilities }
     * 
     */
    public DeviceIOCapabilities createDeviceIOCapabilities() {
        return new DeviceIOCapabilities();
    }

    /**
     * Create an instance of {@link ImageStabilizationExtension }
     * 
     */
    public ImageStabilizationExtension createImageStabilizationExtension() {
        return new ImageStabilizationExtension();
    }

    /**
     * Create an instance of {@link FloatRange }
     * 
     */
    public FloatRange createFloatRange() {
        return new FloatRange();
    }

    /**
     * Create an instance of {@link VideoSource }
     * 
     */
    public VideoSource createVideoSource() {
        return new VideoSource();
    }

    /**
     * Create an instance of {@link PTZConfigurationExtension }
     * 
     */
    public PTZConfigurationExtension createPTZConfigurationExtension() {
        return new PTZConfigurationExtension();
    }

    /**
     * Create an instance of {@link IntRectangle }
     * 
     */
    public IntRectangle createIntRectangle() {
        return new IntRectangle();
    }

    /**
     * Create an instance of {@link Defogging }
     * 
     */
    public Defogging createDefogging() {
        return new Defogging();
    }

    /**
     * Create an instance of {@link Vector }
     * 
     */
    public Vector createVector() {
        return new Vector();
    }

    /**
     * Create an instance of {@link RuleEngineConfigurationExtension }
     * 
     */
    public RuleEngineConfigurationExtension createRuleEngineConfigurationExtension() {
        return new RuleEngineConfigurationExtension();
    }

    /**
     * Create an instance of {@link BacklightCompensation }
     * 
     */
    public BacklightCompensation createBacklightCompensation() {
        return new BacklightCompensation();
    }

    /**
     * Create an instance of {@link MediaUri }
     * 
     */
    public MediaUri createMediaUri() {
        return new MediaUri();
    }

    /**
     * Create an instance of {@link PTZCapabilities }
     * 
     */
    public PTZCapabilities createPTZCapabilities() {
        return new PTZCapabilities();
    }

    /**
     * Create an instance of {@link AnalyticsEngineInputInfo }
     * 
     */
    public AnalyticsEngineInputInfo createAnalyticsEngineInputInfo() {
        return new AnalyticsEngineInputInfo();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension2 }
     * 
     */
    public ImagingOptions20Extension2 createImagingOptions20Extension2() {
        return new ImagingOptions20Extension2();
    }

    /**
     * Create an instance of {@link IntRectangleRange }
     * 
     */
    public IntRectangleRange createIntRectangleRange() {
        return new IntRectangleRange();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension3 }
     * 
     */
    public ImagingOptions20Extension3 createImagingOptions20Extension3() {
        return new ImagingOptions20Extension3();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension4 }
     * 
     */
    public ImagingOptions20Extension4 createImagingOptions20Extension4() {
        return new ImagingOptions20Extension4();
    }

    /**
     * Create an instance of {@link MaximumNumberOfOSDs }
     * 
     */
    public MaximumNumberOfOSDs createMaximumNumberOfOSDs() {
        return new MaximumNumberOfOSDs();
    }

    /**
     * Create an instance of {@link PTZPresetTourPresetDetailOptions }
     * 
     */
    public PTZPresetTourPresetDetailOptions createPTZPresetTourPresetDetailOptions() {
        return new PTZPresetTourPresetDetailOptions();
    }

    /**
     * Create an instance of {@link PolylineArray }
     * 
     */
    public PolylineArray createPolylineArray() {
        return new PolylineArray();
    }

    /**
     * Create an instance of {@link AudioEncoder2Configuration }
     * 
     */
    public AudioEncoder2Configuration createAudioEncoder2Configuration() {
        return new AudioEncoder2Configuration();
    }

    /**
     * Create an instance of {@link VideoRateControl }
     * 
     */
    public VideoRateControl createVideoRateControl() {
        return new VideoRateControl();
    }

    /**
     * Create an instance of {@link JpegDecOptions }
     * 
     */
    public JpegDecOptions createJpegDecOptions() {
        return new JpegDecOptions();
    }

    /**
     * Create an instance of {@link GeoLocation }
     * 
     */
    public GeoLocation createGeoLocation() {
        return new GeoLocation();
    }

    /**
     * Create an instance of {@link MediaCapabilitiesExtension }
     * 
     */
    public MediaCapabilitiesExtension createMediaCapabilitiesExtension() {
        return new MediaCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link PanTiltLimits }
     * 
     */
    public PanTiltLimits createPanTiltLimits() {
        return new PanTiltLimits();
    }

    /**
     * Create an instance of {@link Transport }
     * 
     */
    public Transport createTransport() {
        return new Transport();
    }

    /**
     * Create an instance of {@link DeviceCapabilitiesExtension }
     * 
     */
    public DeviceCapabilitiesExtension createDeviceCapabilitiesExtension() {
        return new DeviceCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link WideDynamicRange }
     * 
     */
    public WideDynamicRange createWideDynamicRange() {
        return new WideDynamicRange();
    }

    /**
     * Create an instance of {@link RealTimeStreamingCapabilitiesExtension }
     * 
     */
    public RealTimeStreamingCapabilitiesExtension createRealTimeStreamingCapabilitiesExtension() {
        return new RealTimeStreamingCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link SystemDateTimeExtension }
     * 
     */
    public SystemDateTimeExtension createSystemDateTimeExtension() {
        return new SystemDateTimeExtension();
    }

    /**
     * Create an instance of {@link OSDColorOptionsExtension }
     * 
     */
    public OSDColorOptionsExtension createOSDColorOptionsExtension() {
        return new OSDColorOptionsExtension();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link CertificateInformationExtension }
     * 
     */
    public CertificateInformationExtension createCertificateInformationExtension() {
        return new CertificateInformationExtension();
    }

    /**
     * Create an instance of {@link ContinuousFocusOptions }
     * 
     */
    public ContinuousFocusOptions createContinuousFocusOptions() {
        return new ContinuousFocusOptions();
    }

    /**
     * Create an instance of {@link PTZPositionFilter }
     * 
     */
    public PTZPositionFilter createPTZPositionFilter() {
        return new PTZPositionFilter();
    }

    /**
     * Create an instance of {@link FindEventResult }
     * 
     */
    public FindEventResult createFindEventResult() {
        return new FindEventResult();
    }

    /**
     * Create an instance of {@link ExposureOptions20 }
     * 
     */
    public ExposureOptions20 createExposureOptions20() {
        return new ExposureOptions20();
    }

    /**
     * Create an instance of {@link SystemCapabilities2 }
     * 
     */
    public SystemCapabilities2 createSystemCapabilities2() {
        return new SystemCapabilities2();
    }

    /**
     * Create an instance of {@link NetworkZeroConfigurationExtension }
     * 
     */
    public NetworkZeroConfigurationExtension createNetworkZeroConfigurationExtension() {
        return new NetworkZeroConfigurationExtension();
    }

    /**
     * Create an instance of {@link TLSConfiguration }
     * 
     */
    public TLSConfiguration createTLSConfiguration() {
        return new TLSConfiguration();
    }

    /**
     * Create an instance of {@link NoiseReductionOptions }
     * 
     */
    public NoiseReductionOptions createNoiseReductionOptions() {
        return new NoiseReductionOptions();
    }

    /**
     * Create an instance of {@link FileProgress }
     * 
     */
    public FileProgress createFileProgress() {
        return new FileProgress();
    }

    /**
     * Create an instance of {@link JpegOptions }
     * 
     */
    public JpegOptions createJpegOptions() {
        return new JpegOptions();
    }

    /**
     * Create an instance of {@link PaneLayout }
     * 
     */
    public PaneLayout createPaneLayout() {
        return new PaneLayout();
    }

    /**
     * Create an instance of {@link ReplayCapabilities }
     * 
     */
    public ReplayCapabilities createReplayCapabilities() {
        return new ReplayCapabilities();
    }

    /**
     * Create an instance of {@link VideoDecoderConfigurationOptionsExtension }
     * 
     */
    public VideoDecoderConfigurationOptionsExtension createVideoDecoderConfigurationOptionsExtension() {
        return new VideoDecoderConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link OSDColor }
     * 
     */
    public OSDColor createOSDColor() {
        return new OSDColor();
    }

    /**
     * Create an instance of {@link FloatList }
     * 
     */
    public FloatList createFloatList() {
        return new FloatList();
    }

    /**
     * Create an instance of {@link PTZConfigurationOptions }
     * 
     */
    public PTZConfigurationOptions createPTZConfigurationOptions() {
        return new PTZConfigurationOptions();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension }
     * 
     */
    public ImagingOptions20Extension createImagingOptions20Extension() {
        return new ImagingOptions20Extension();
    }

    /**
     * Create an instance of {@link PrefixedIPv4Address }
     * 
     */
    public PrefixedIPv4Address createPrefixedIPv4Address() {
        return new PrefixedIPv4Address();
    }

    /**
     * Create an instance of {@link RecordingSummary }
     * 
     */
    public RecordingSummary createRecordingSummary() {
        return new RecordingSummary();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationOptionsExtension }
     * 
     */
    public VideoSourceConfigurationOptionsExtension createVideoSourceConfigurationOptionsExtension() {
        return new VideoSourceConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link NetworkCapabilitiesExtension2 }
     * 
     */
    public NetworkCapabilitiesExtension2 createNetworkCapabilitiesExtension2() {
        return new NetworkCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link Space1DDescription }
     * 
     */
    public Space1DDescription createSpace1DDescription() {
        return new Space1DDescription();
    }

    /**
     * Create an instance of {@link RealTimeStreamingCapabilities }
     * 
     */
    public RealTimeStreamingCapabilities createRealTimeStreamingCapabilities() {
        return new RealTimeStreamingCapabilities();
    }

    /**
     * Create an instance of {@link RecordingConfiguration }
     * 
     */
    public RecordingConfiguration createRecordingConfiguration() {
        return new RecordingConfiguration();
    }

    /**
     * Create an instance of {@link SourceIdentificationExtension }
     * 
     */
    public SourceIdentificationExtension createSourceIdentificationExtension() {
        return new SourceIdentificationExtension();
    }

    /**
     * Create an instance of {@link G711DecOptions }
     * 
     */
    public G711DecOptions createG711DecOptions() {
        return new G711DecOptions();
    }

    /**
     * Create an instance of {@link MediaCapabilities }
     * 
     */
    public MediaCapabilities createMediaCapabilities() {
        return new MediaCapabilities();
    }

    /**
     * Create an instance of {@link RecordingJobStateInformationExtension }
     * 
     */
    public RecordingJobStateInformationExtension createRecordingJobStateInformationExtension() {
        return new RecordingJobStateInformationExtension();
    }

    /**
     * Create an instance of {@link PolylineArrayExtension }
     * 
     */
    public PolylineArrayExtension createPolylineArrayExtension() {
        return new PolylineArrayExtension();
    }

    /**
     * Create an instance of {@link OSDPosConfigurationExtension }
     * 
     */
    public OSDPosConfigurationExtension createOSDPosConfigurationExtension() {
        return new OSDPosConfigurationExtension();
    }

    /**
     * Create an instance of {@link FocusOptions20 }
     * 
     */
    public FocusOptions20 createFocusOptions20() {
        return new FocusOptions20();
    }

    /**
     * Create an instance of {@link PTZNodeExtension }
     * 
     */
    public PTZNodeExtension createPTZNodeExtension() {
        return new PTZNodeExtension();
    }

    /**
     * Create an instance of {@link PTZNode }
     * 
     */
    public PTZNode createPTZNode() {
        return new PTZNode();
    }

    /**
     * Create an instance of {@link PTZSpacesExtension }
     * 
     */
    public PTZSpacesExtension createPTZSpacesExtension() {
        return new PTZSpacesExtension();
    }

    /**
     * Create an instance of {@link ReverseOptions }
     * 
     */
    public ReverseOptions createReverseOptions() {
        return new ReverseOptions();
    }

    /**
     * Create an instance of {@link IPAddressFilterExtension }
     * 
     */
    public IPAddressFilterExtension createIPAddressFilterExtension() {
        return new IPAddressFilterExtension();
    }

    /**
     * Create an instance of {@link Dot11Configuration }
     * 
     */
    public Dot11Configuration createDot11Configuration() {
        return new Dot11Configuration();
    }

    /**
     * Create an instance of {@link Receiver }
     * 
     */
    public Receiver createReceiver() {
        return new Receiver();
    }

    /**
     * Create an instance of {@link OSDTextConfiguration }
     * 
     */
    public OSDTextConfiguration createOSDTextConfiguration() {
        return new OSDTextConfiguration();
    }

    /**
     * Create an instance of {@link RotateExtension }
     * 
     */
    public RotateExtension createRotateExtension() {
        return new RotateExtension();
    }

    /**
     * Create an instance of {@link MoveOptions }
     * 
     */
    public MoveOptions createMoveOptions() {
        return new MoveOptions();
    }

    /**
     * Create an instance of {@link H264Options2 }
     * 
     */
    public H264Options2 createH264Options2() {
        return new H264Options2();
    }

    /**
     * Create an instance of {@link ExposureOptions }
     * 
     */
    public ExposureOptions createExposureOptions() {
        return new ExposureOptions();
    }

    /**
     * Create an instance of {@link GenericEapPwdConfigurationExtension }
     * 
     */
    public GenericEapPwdConfigurationExtension createGenericEapPwdConfigurationExtension() {
        return new GenericEapPwdConfigurationExtension();
    }

    /**
     * Create an instance of {@link PTControlDirectionExtension }
     * 
     */
    public PTControlDirectionExtension createPTControlDirectionExtension() {
        return new PTControlDirectionExtension();
    }

    /**
     * Create an instance of {@link ActionEngineEventPayload }
     * 
     */
    public ActionEngineEventPayload createActionEngineEventPayload() {
        return new ActionEngineEventPayload();
    }

    /**
     * Create an instance of {@link EFlip }
     * 
     */
    public EFlip createEFlip() {
        return new EFlip();
    }

    /**
     * Create an instance of {@link VideoRateControl2 }
     * 
     */
    public VideoRateControl2 createVideoRateControl2() {
        return new VideoRateControl2();
    }

    /**
     * Create an instance of {@link NetworkInterfaceExtension }
     * 
     */
    public NetworkInterfaceExtension createNetworkInterfaceExtension() {
        return new NetworkInterfaceExtension();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension20 }
     * 
     */
    public ImagingSettingsExtension20 createImagingSettingsExtension20() {
        return new ImagingSettingsExtension20();
    }

    /**
     * Create an instance of {@link PTControlDirectionOptions }
     * 
     */
    public PTControlDirectionOptions createPTControlDirectionOptions() {
        return new PTControlDirectionOptions();
    }

    /**
     * Create an instance of {@link IPv6ConfigurationExtension }
     * 
     */
    public IPv6ConfigurationExtension createIPv6ConfigurationExtension() {
        return new IPv6ConfigurationExtension();
    }

    /**
     * Create an instance of {@link WideDynamicRangeOptions20 }
     * 
     */
    public WideDynamicRangeOptions20 createWideDynamicRangeOptions20() {
        return new WideDynamicRangeOptions20();
    }

    /**
     * Create an instance of {@link ArrayOfFileProgress }
     * 
     */
    public ArrayOfFileProgress createArrayOfFileProgress() {
        return new ArrayOfFileProgress();
    }

    /**
     * Create an instance of {@link VideoEncoderOptionsExtension }
     * 
     */
    public VideoEncoderOptionsExtension createVideoEncoderOptionsExtension() {
        return new VideoEncoderOptionsExtension();
    }

    /**
     * Create an instance of {@link PTControlDirectionOptionsExtension }
     * 
     */
    public PTControlDirectionOptionsExtension createPTControlDirectionOptionsExtension() {
        return new PTControlDirectionOptionsExtension();
    }

    /**
     * Create an instance of {@link RuleEngineConfiguration }
     * 
     */
    public RuleEngineConfiguration createRuleEngineConfiguration() {
        return new RuleEngineConfiguration();
    }

    /**
     * Create an instance of {@link Mpeg4Configuration }
     * 
     */
    public Mpeg4Configuration createMpeg4Configuration() {
        return new Mpeg4Configuration();
    }

    /**
     * Create an instance of {@link RecordingJobConfigurationExtension }
     * 
     */
    public RecordingJobConfigurationExtension createRecordingJobConfigurationExtension() {
        return new RecordingJobConfigurationExtension();
    }

    /**
     * Create an instance of {@link VideoResolution }
     * 
     */
    public VideoResolution createVideoResolution() {
        return new VideoResolution();
    }

    /**
     * Create an instance of {@link DNSInformationExtension }
     * 
     */
    public DNSInformationExtension createDNSInformationExtension() {
        return new DNSInformationExtension();
    }

    /**
     * Create an instance of {@link AudioAttributes }
     * 
     */
    public AudioAttributes createAudioAttributes() {
        return new AudioAttributes();
    }

    /**
     * Create an instance of {@link MetadataConfigurationOptionsExtension }
     * 
     */
    public MetadataConfigurationOptionsExtension createMetadataConfigurationOptionsExtension() {
        return new MetadataConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link AudioEncoder2ConfigurationOptions }
     * 
     */
    public AudioEncoder2ConfigurationOptions createAudioEncoder2ConfigurationOptions() {
        return new AudioEncoder2ConfigurationOptions();
    }

    /**
     * Create an instance of {@link NetworkInterfaceLink }
     * 
     */
    public NetworkInterfaceLink createNetworkInterfaceLink() {
        return new NetworkInterfaceLink();
    }

    /**
     * Create an instance of {@link PTZStatus }
     * 
     */
    public PTZStatus createPTZStatus() {
        return new PTZStatus();
    }

    /**
     * Create an instance of {@link FindRecordingResultList }
     * 
     */
    public FindRecordingResultList createFindRecordingResultList() {
        return new FindRecordingResultList();
    }

    /**
     * Create an instance of {@link WhiteBalanceOptions }
     * 
     */
    public WhiteBalanceOptions createWhiteBalanceOptions() {
        return new WhiteBalanceOptions();
    }

    /**
     * Create an instance of {@link Reverse }
     * 
     */
    public Reverse createReverse() {
        return new Reverse();
    }

    /**
     * Create an instance of {@link VideoOutputExtension }
     * 
     */
    public VideoOutputExtension createVideoOutputExtension() {
        return new VideoOutputExtension();
    }

    /**
     * Create an instance of {@link VideoAttributes }
     * 
     */
    public VideoAttributes createVideoAttributes() {
        return new VideoAttributes();
    }

    /**
     * Create an instance of {@link ReceiverCapabilities }
     * 
     */
    public ReceiverCapabilities createReceiverCapabilities() {
        return new ReceiverCapabilities();
    }

    /**
     * Create an instance of {@link RecordingJobSource }
     * 
     */
    public RecordingJobSource createRecordingJobSource() {
        return new RecordingJobSource();
    }

    /**
     * Create an instance of {@link AbsoluteFocusOptions }
     * 
     */
    public AbsoluteFocusOptions createAbsoluteFocusOptions() {
        return new AbsoluteFocusOptions();
    }

    /**
     * Create an instance of {@link PaneOptionExtension }
     * 
     */
    public PaneOptionExtension createPaneOptionExtension() {
        return new PaneOptionExtension();
    }

    /**
     * Create an instance of {@link OSDConfiguration }
     * 
     */
    public OSDConfiguration createOSDConfiguration() {
        return new OSDConfiguration();
    }

    /**
     * Create an instance of {@link IPv4Configuration }
     * 
     */
    public IPv4Configuration createIPv4Configuration() {
        return new IPv4Configuration();
    }

    /**
     * Create an instance of {@link ImagingSettings }
     * 
     */
    public ImagingSettings createImagingSettings() {
        return new ImagingSettings();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustmentOptionsExtension }
     * 
     */
    public IrCutFilterAutoAdjustmentOptionsExtension createIrCutFilterAutoAdjustmentOptionsExtension() {
        return new IrCutFilterAutoAdjustmentOptionsExtension();
    }

    /**
     * Create an instance of {@link VideoEncoder2ConfigurationOptions }
     * 
     */
    public VideoEncoder2ConfigurationOptions createVideoEncoder2ConfigurationOptions() {
        return new VideoEncoder2ConfigurationOptions();
    }

    /**
     * Create an instance of {@link FocusStatus20Extension }
     * 
     */
    public FocusStatus20Extension createFocusStatus20Extension() {
        return new FocusStatus20Extension();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceEngineConfigurationExtension }
     * 
     */
    public AnalyticsDeviceEngineConfigurationExtension createAnalyticsDeviceEngineConfigurationExtension() {
        return new AnalyticsDeviceEngineConfigurationExtension();
    }

    /**
     * Create an instance of {@link AACDecOptions }
     * 
     */
    public AACDecOptions createAACDecOptions() {
        return new AACDecOptions();
    }

    /**
     * Create an instance of {@link ZoomLimits }
     * 
     */
    public ZoomLimits createZoomLimits() {
        return new ZoomLimits();
    }

    /**
     * Create an instance of {@link SystemLogUri }
     * 
     */
    public SystemLogUri createSystemLogUri() {
        return new SystemLogUri();
    }

    /**
     * Create an instance of {@link TrackInformation }
     * 
     */
    public TrackInformation createTrackInformation() {
        return new TrackInformation();
    }

    /**
     * Create an instance of {@link ProfileStatus }
     * 
     */
    public ProfileStatus createProfileStatus() {
        return new ProfileStatus();
    }

    /**
     * Create an instance of {@link Mpeg4Options2 }
     * 
     */
    public Mpeg4Options2 createMpeg4Options2() {
        return new Mpeg4Options2();
    }

    /**
     * Create an instance of {@link ProfileExtension2 }
     * 
     */
    public ProfileExtension2 createProfileExtension2() {
        return new ProfileExtension2();
    }

    /**
     * Create an instance of {@link VideoSourceExtension2 }
     * 
     */
    public VideoSourceExtension2 createVideoSourceExtension2() {
        return new VideoSourceExtension2();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceCapabilities }
     * 
     */
    public AnalyticsDeviceCapabilities createAnalyticsDeviceCapabilities() {
        return new AnalyticsDeviceCapabilities();
    }

    /**
     * Create an instance of {@link FocusOptions20Extension }
     * 
     */
    public FocusOptions20Extension createFocusOptions20Extension() {
        return new FocusOptions20Extension();
    }

    /**
     * Create an instance of {@link FindEventResultList }
     * 
     */
    public FindEventResultList createFindEventResultList() {
        return new FindEventResultList();
    }

    /**
     * Create an instance of {@link PresetTour }
     * 
     */
    public PresetTour createPresetTour() {
        return new PresetTour();
    }

    /**
     * Create an instance of {@link PTControlDirection }
     * 
     */
    public PTControlDirection createPTControlDirection() {
        return new PTControlDirection();
    }

    /**
     * Create an instance of {@link PTZPreset }
     * 
     */
    public PTZPreset createPTZPreset() {
        return new PTZPreset();
    }

    /**
     * Create an instance of {@link ToneCompensation }
     * 
     */
    public ToneCompensation createToneCompensation() {
        return new ToneCompensation();
    }

    /**
     * Create an instance of {@link IntRange }
     * 
     */
    public IntRange createIntRange() {
        return new IntRange();
    }

    /**
     * Create an instance of {@link GetRecordingJobsResponseItem }
     * 
     */
    public GetRecordingJobsResponseItem createGetRecordingJobsResponseItem() {
        return new GetRecordingJobsResponseItem();
    }

    /**
     * Create an instance of {@link ImagingSettings20 }
     * 
     */
    public ImagingSettings20 createImagingSettings20() {
        return new ImagingSettings20();
    }

    /**
     * Create an instance of {@link ActiveConnection }
     * 
     */
    public ActiveConnection createActiveConnection() {
        return new ActiveConnection();
    }

    /**
     * Create an instance of {@link OSDImgOptionsExtension }
     * 
     */
    public OSDImgOptionsExtension createOSDImgOptionsExtension() {
        return new OSDImgOptionsExtension();
    }

    /**
     * Create an instance of {@link MetadataFilter }
     * 
     */
    public MetadataFilter createMetadataFilter() {
        return new MetadataFilter();
    }

    /**
     * Create an instance of {@link OSDColorOptions }
     * 
     */
    public OSDColorOptions createOSDColorOptions() {
        return new OSDColorOptions();
    }

    /**
     * Create an instance of {@link NetworkInterfaceInfo }
     * 
     */
    public NetworkInterfaceInfo createNetworkInterfaceInfo() {
        return new NetworkInterfaceInfo();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceEngineConfiguration }
     * 
     */
    public AnalyticsDeviceEngineConfiguration createAnalyticsDeviceEngineConfiguration() {
        return new AnalyticsDeviceEngineConfiguration();
    }

    /**
     * Create an instance of {@link SearchScopeExtension }
     * 
     */
    public SearchScopeExtension createSearchScopeExtension() {
        return new SearchScopeExtension();
    }

    /**
     * Create an instance of {@link IPv6Configuration }
     * 
     */
    public IPv6Configuration createIPv6Configuration() {
        return new IPv6Configuration();
    }

    /**
     * Create an instance of {@link Dot11SecurityConfigurationExtension }
     * 
     */
    public Dot11SecurityConfigurationExtension createDot11SecurityConfigurationExtension() {
        return new Dot11SecurityConfigurationExtension();
    }

    /**
     * Create an instance of {@link DefoggingExtension }
     * 
     */
    public DefoggingExtension createDefoggingExtension() {
        return new DefoggingExtension();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustmentExtension }
     * 
     */
    public IrCutFilterAutoAdjustmentExtension createIrCutFilterAutoAdjustmentExtension() {
        return new IrCutFilterAutoAdjustmentExtension();
    }

    /**
     * Create an instance of {@link PTZSpaces }
     * 
     */
    public PTZSpaces createPTZSpaces() {
        return new PTZSpaces();
    }

    /**
     * Create an instance of {@link FocusOptions }
     * 
     */
    public FocusOptions createFocusOptions() {
        return new FocusOptions();
    }

    /**
     * Create an instance of {@link DisplayCapabilities }
     * 
     */
    public DisplayCapabilities createDisplayCapabilities() {
        return new DisplayCapabilities();
    }

    /**
     * Create an instance of {@link PTZMoveStatus }
     * 
     */
    public PTZMoveStatus createPTZMoveStatus() {
        return new PTZMoveStatus();
    }

    /**
     * Create an instance of {@link WhiteBalance20Extension }
     * 
     */
    public WhiteBalance20Extension createWhiteBalance20Extension() {
        return new WhiteBalance20Extension();
    }

    /**
     * Create an instance of {@link NetworkZeroConfigurationExtension2 }
     * 
     */
    public NetworkZeroConfigurationExtension2 createNetworkZeroConfigurationExtension2() {
        return new NetworkZeroConfigurationExtension2();
    }

    /**
     * Create an instance of {@link MetadataInput }
     * 
     */
    public MetadataInput createMetadataInput() {
        return new MetadataInput();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationOptionsExtension2 }
     * 
     */
    public VideoSourceConfigurationOptionsExtension2 createVideoSourceConfigurationOptionsExtension2() {
        return new VideoSourceConfigurationOptionsExtension2();
    }

    /**
     * Create an instance of {@link VideoSourceExtension }
     * 
     */
    public VideoSourceExtension createVideoSourceExtension() {
        return new VideoSourceExtension();
    }

    /**
     * Create an instance of {@link OSDImgConfigurationExtension }
     * 
     */
    public OSDImgConfigurationExtension createOSDImgConfigurationExtension() {
        return new OSDImgConfigurationExtension();
    }

    /**
     * Create an instance of {@link RecordingJobConfiguration }
     * 
     */
    public RecordingJobConfiguration createRecordingJobConfiguration() {
        return new RecordingJobConfiguration();
    }

    /**
     * Create an instance of {@link TrackAttributesExtension }
     * 
     */
    public TrackAttributesExtension createTrackAttributesExtension() {
        return new TrackAttributesExtension();
    }

    /**
     * Create an instance of {@link GetRecordingsResponseItem }
     * 
     */
    public GetRecordingsResponseItem createGetRecordingsResponseItem() {
        return new GetRecordingsResponseItem();
    }

    /**
     * Create an instance of {@link PaneConfiguration }
     * 
     */
    public PaneConfiguration createPaneConfiguration() {
        return new PaneConfiguration();
    }

    /**
     * Create an instance of {@link H264DecOptions }
     * 
     */
    public H264DecOptions createH264DecOptions() {
        return new H264DecOptions();
    }

    /**
     * Create an instance of {@link VideoEncoder2Configuration }
     * 
     */
    public VideoEncoder2Configuration createVideoEncoder2Configuration() {
        return new VideoEncoder2Configuration();
    }

    /**
     * Create an instance of {@link HostnameInformationExtension }
     * 
     */
    public HostnameInformationExtension createHostnameInformationExtension() {
        return new HostnameInformationExtension();
    }

    /**
     * Create an instance of {@link RelativeFocusOptions20 }
     * 
     */
    public RelativeFocusOptions20 createRelativeFocusOptions20() {
        return new RelativeFocusOptions20();
    }

    /**
     * Create an instance of {@link H264Configuration }
     * 
     */
    public H264Configuration createH264Configuration() {
        return new H264Configuration();
    }

    /**
     * Create an instance of {@link CertificateGenerationParametersExtension }
     * 
     */
    public CertificateGenerationParametersExtension createCertificateGenerationParametersExtension() {
        return new CertificateGenerationParametersExtension();
    }

    /**
     * Create an instance of {@link ToneCompensationExtension }
     * 
     */
    public ToneCompensationExtension createToneCompensationExtension() {
        return new ToneCompensationExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingConditionOptionsExtension }
     * 
     */
    public PTZPresetTourStartingConditionOptionsExtension createPTZPresetTourStartingConditionOptionsExtension() {
        return new PTZPresetTourStartingConditionOptionsExtension();
    }

    /**
     * Create an instance of {@link IOCapabilitiesExtension2 }
     * 
     */
    public IOCapabilitiesExtension2 createIOCapabilitiesExtension2() {
        return new IOCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link PTZPresetTourSpotOptions }
     * 
     */
    public PTZPresetTourSpotOptions createPTZPresetTourSpotOptions() {
        return new PTZPresetTourSpotOptions();
    }

    /**
     * Create an instance of {@link AudioDecoderConfigurationOptionsExtension }
     * 
     */
    public AudioDecoderConfigurationOptionsExtension createAudioDecoderConfigurationOptionsExtension() {
        return new AudioDecoderConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link NetworkInterfaceExtension2 }
     * 
     */
    public NetworkInterfaceExtension2 createNetworkInterfaceExtension2() {
        return new NetworkInterfaceExtension2();
    }

    /**
     * Create an instance of {@link RecordingJobStateSource }
     * 
     */
    public RecordingJobStateSource createRecordingJobStateSource() {
        return new RecordingJobStateSource();
    }

    /**
     * Create an instance of {@link NetworkInterfaceConnectionSetting }
     * 
     */
    public NetworkInterfaceConnectionSetting createNetworkInterfaceConnectionSetting() {
        return new NetworkInterfaceConnectionSetting();
    }

    /**
     * Create an instance of {@link NetworkInterfaceSetConfigurationExtension2 }
     * 
     */
    public NetworkInterfaceSetConfigurationExtension2 createNetworkInterfaceSetConfigurationExtension2() {
        return new NetworkInterfaceSetConfigurationExtension2();
    }

    /**
     * Create an instance of {@link CertificateGenerationParameters }
     * 
     */
    public CertificateGenerationParameters createCertificateGenerationParameters() {
        return new CertificateGenerationParameters();
    }

    /**
     * Create an instance of {@link CellLayout }
     * 
     */
    public CellLayout createCellLayout() {
        return new CellLayout();
    }

    /**
     * Create an instance of {@link ActionEngineEventPayloadExtension }
     * 
     */
    public ActionEngineEventPayloadExtension createActionEngineEventPayloadExtension() {
        return new ActionEngineEventPayloadExtension();
    }

    /**
     * Create an instance of {@link Vector1D }
     * 
     */
    public Vector1D createVector1D() {
        return new Vector1D();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension204 }
     * 
     */
    public ImagingSettingsExtension204 createImagingSettingsExtension204() {
        return new ImagingSettingsExtension204();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension202 }
     * 
     */
    public ImagingSettingsExtension202 createImagingSettingsExtension202() {
        return new ImagingSettingsExtension202();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension203 }
     * 
     */
    public ImagingSettingsExtension203 createImagingSettingsExtension203() {
        return new ImagingSettingsExtension203();
    }

    /**
     * Create an instance of {@link AbsoluteFocus }
     * 
     */
    public AbsoluteFocus createAbsoluteFocus() {
        return new AbsoluteFocus();
    }

    /**
     * Create an instance of {@link ArrayOfFileProgressExtension }
     * 
     */
    public ArrayOfFileProgressExtension createArrayOfFileProgressExtension() {
        return new ArrayOfFileProgressExtension();
    }

    /**
     * Create an instance of {@link BacklightCompensationOptions }
     * 
     */
    public BacklightCompensationOptions createBacklightCompensationOptions() {
        return new BacklightCompensationOptions();
    }

    /**
     * Create an instance of {@link ReplayConfiguration }
     * 
     */
    public ReplayConfiguration createReplayConfiguration() {
        return new ReplayConfiguration();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingConditionExtension }
     * 
     */
    public PTZPresetTourStartingConditionExtension createPTZPresetTourStartingConditionExtension() {
        return new PTZPresetTourStartingConditionExtension();
    }

    /**
     * Create an instance of {@link OSDConfigurationOptionsExtension }
     * 
     */
    public OSDConfigurationOptionsExtension createOSDConfigurationOptionsExtension() {
        return new OSDConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link ImagingCapabilities }
     * 
     */
    public ImagingCapabilities createImagingCapabilities() {
        return new ImagingCapabilities();
    }

    /**
     * Create an instance of {@link IntList }
     * 
     */
    public IntList createIntList() {
        return new IntList();
    }

    /**
     * Create an instance of {@link AudioSource }
     * 
     */
    public AudioSource createAudioSource() {
        return new AudioSource();
    }

    /**
     * Create an instance of {@link Vector2D }
     * 
     */
    public Vector2D createVector2D() {
        return new Vector2D();
    }

    /**
     * Create an instance of {@link WhiteBalance20 }
     * 
     */
    public WhiteBalance20 createWhiteBalance20() {
        return new WhiteBalance20();
    }

    /**
     * Create an instance of {@link VideoResolution2 }
     * 
     */
    public VideoResolution2 createVideoResolution2() {
        return new VideoResolution2();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationOptions }
     * 
     */
    public VideoSourceConfigurationOptions createVideoSourceConfigurationOptions() {
        return new VideoSourceConfigurationOptions();
    }

    /**
     * Create an instance of {@link ImagingStatus20Extension }
     * 
     */
    public ImagingStatus20Extension createImagingStatus20Extension() {
        return new ImagingStatus20Extension();
    }

    /**
     * Create an instance of {@link ImageStabilizationOptions }
     * 
     */
    public ImageStabilizationOptions createImageStabilizationOptions() {
        return new ImageStabilizationOptions();
    }

    /**
     * Create an instance of {@link IOCapabilitiesExtension }
     * 
     */
    public IOCapabilitiesExtension createIOCapabilitiesExtension() {
        return new IOCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link AudioOutputConfigurationOptions }
     * 
     */
    public AudioOutputConfigurationOptions createAudioOutputConfigurationOptions() {
        return new AudioOutputConfigurationOptions();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link Dot11SecurityConfiguration }
     * 
     */
    public Dot11SecurityConfiguration createDot11SecurityConfiguration() {
        return new Dot11SecurityConfiguration();
    }

    /**
     * Create an instance of {@link PTZVector }
     * 
     */
    public PTZVector createPTZVector() {
        return new PTZVector();
    }

    /**
     * Create an instance of {@link DynamicDNSInformationExtension }
     * 
     */
    public DynamicDNSInformationExtension createDynamicDNSInformationExtension() {
        return new DynamicDNSInformationExtension();
    }

    /**
     * Create an instance of {@link Mpeg4Options }
     * 
     */
    public Mpeg4Options createMpeg4Options() {
        return new Mpeg4Options();
    }

    /**
     * Create an instance of {@link LocalLocation }
     * 
     */
    public LocalLocation createLocalLocation() {
        return new LocalLocation();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustmentOptions }
     * 
     */
    public IrCutFilterAutoAdjustmentOptions createIrCutFilterAutoAdjustmentOptions() {
        return new IrCutFilterAutoAdjustmentOptions();
    }

    /**
     * Create an instance of {@link ImageStabilizationOptionsExtension }
     * 
     */
    public ImageStabilizationOptionsExtension createImageStabilizationOptionsExtension() {
        return new ImageStabilizationOptionsExtension();
    }

    /**
     * Create an instance of {@link OSDPosConfiguration }
     * 
     */
    public OSDPosConfiguration createOSDPosConfiguration() {
        return new OSDPosConfiguration();
    }

    /**
     * Create an instance of {@link MoveOptions20 }
     * 
     */
    public MoveOptions20 createMoveOptions20() {
        return new MoveOptions20();
    }

    /**
     * Create an instance of {@link SecurityCapabilitiesExtension2 }
     * 
     */
    public SecurityCapabilitiesExtension2 createSecurityCapabilitiesExtension2() {
        return new SecurityCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link Mpeg4DecOptions }
     * 
     */
    public Mpeg4DecOptions createMpeg4DecOptions() {
        return new Mpeg4DecOptions();
    }

    /**
     * Create an instance of {@link AudioClassDescriptor }
     * 
     */
    public AudioClassDescriptor createAudioClassDescriptor() {
        return new AudioClassDescriptor();
    }

    /**
     * Create an instance of {@link EventCapabilities }
     * 
     */
    public EventCapabilities createEventCapabilities() {
        return new EventCapabilities();
    }

    /**
     * Create an instance of {@link SupportedRulesExtension }
     * 
     */
    public SupportedRulesExtension createSupportedRulesExtension() {
        return new SupportedRulesExtension();
    }

    /**
     * Create an instance of {@link IPv4NetworkInterface }
     * 
     */
    public IPv4NetworkInterface createIPv4NetworkInterface() {
        return new IPv4NetworkInterface();
    }

    /**
     * Create an instance of {@link AnalyticsEngineInputInfoExtension }
     * 
     */
    public AnalyticsEngineInputInfoExtension createAnalyticsEngineInputInfoExtension() {
        return new AnalyticsEngineInputInfoExtension();
    }

    /**
     * Create an instance of {@link ToneCompensationOptions }
     * 
     */
    public ToneCompensationOptions createToneCompensationOptions() {
        return new ToneCompensationOptions();
    }

    /**
     * Create an instance of {@link PTZConfigurationOptions2 }
     * 
     */
    public PTZConfigurationOptions2 createPTZConfigurationOptions2() {
        return new PTZConfigurationOptions2();
    }

    /**
     * Create an instance of {@link ReceiverStateInformation }
     * 
     */
    public ReceiverStateInformation createReceiverStateInformation() {
        return new ReceiverStateInformation();
    }

    /**
     * Create an instance of {@link AnalyticsState }
     * 
     */
    public AnalyticsState createAnalyticsState() {
        return new AnalyticsState();
    }

    /**
     * Create an instance of {@link Rotate }
     * 
     */
    public Rotate createRotate() {
        return new Rotate();
    }

    /**
     * Create an instance of {@link GetTracksResponseItem }
     * 
     */
    public GetTracksResponseItem createGetTracksResponseItem() {
        return new GetTracksResponseItem();
    }

    /**
     * Create an instance of {@link PTZPresetTourSupportedExtension }
     * 
     */
    public PTZPresetTourSupportedExtension createPTZPresetTourSupportedExtension() {
        return new PTZPresetTourSupportedExtension();
    }

    /**
     * Create an instance of {@link ColorspaceRange }
     * 
     */
    public ColorspaceRange createColorspaceRange() {
        return new ColorspaceRange();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceExtension }
     * 
     */
    public AnalyticsDeviceExtension createAnalyticsDeviceExtension() {
        return new AnalyticsDeviceExtension();
    }

    /**
     * Create an instance of {@link PolylineArrayConfiguration }
     * 
     */
    public PolylineArrayConfiguration createPolylineArrayConfiguration() {
        return new PolylineArrayConfiguration();
    }

    /**
     * Create an instance of {@link IPv6NetworkInterfaceSetConfiguration }
     * 
     */
    public IPv6NetworkInterfaceSetConfiguration createIPv6NetworkInterfaceSetConfiguration() {
        return new IPv6NetworkInterfaceSetConfiguration();
    }

    /**
     * Create an instance of {@link PTZSpeed }
     * 
     */
    public PTZSpeed createPTZSpeed() {
        return new PTZSpeed();
    }

    /**
     * Create an instance of {@link SourceReference }
     * 
     */
    public SourceReference createSourceReference() {
        return new SourceReference();
    }

    /**
     * Create an instance of {@link AudioOutput }
     * 
     */
    public AudioOutput createAudioOutput() {
        return new AudioOutput();
    }

    /**
     * Create an instance of {@link VideoOutputConfiguration }
     * 
     */
    public VideoOutputConfiguration createVideoOutputConfiguration() {
        return new VideoOutputConfiguration();
    }

    /**
     * Create an instance of {@link FocusConfiguration20Extension }
     * 
     */
    public FocusConfiguration20Extension createFocusConfiguration20Extension() {
        return new FocusConfiguration20Extension();
    }

    /**
     * Create an instance of {@link OnvifVersion }
     * 
     */
    public OnvifVersion createOnvifVersion() {
        return new OnvifVersion();
    }

    /**
     * Create an instance of {@link PTZStatusFilterOptions }
     * 
     */
    public PTZStatusFilterOptions createPTZStatusFilterOptions() {
        return new PTZStatusFilterOptions();
    }

    /**
     * Create an instance of {@link AnalyticsEngineConfigurationExtension }
     * 
     */
    public AnalyticsEngineConfigurationExtension createAnalyticsEngineConfigurationExtension() {
        return new AnalyticsEngineConfigurationExtension();
    }

    /**
     * Create an instance of {@link RecordingSourceInformation }
     * 
     */
    public RecordingSourceInformation createRecordingSourceInformation() {
        return new RecordingSourceInformation();
    }

    /**
     * Create an instance of {@link RotateOptionsExtension }
     * 
     */
    public RotateOptionsExtension createRotateOptionsExtension() {
        return new RotateOptionsExtension();
    }

    /**
     * Create an instance of {@link ReceiverConfiguration }
     * 
     */
    public ReceiverConfiguration createReceiverConfiguration() {
        return new ReceiverConfiguration();
    }

    /**
     * Create an instance of {@link ImagingStatus20 }
     * 
     */
    public ImagingStatus20 createImagingStatus20() {
        return new ImagingStatus20();
    }

    /**
     * Create an instance of {@link Transformation }
     * 
     */
    public Transformation createTransformation() {
        return new Transformation();
    }

    /**
     * Create an instance of {@link AudioSourceOptionsExtension }
     * 
     */
    public AudioSourceOptionsExtension createAudioSourceOptionsExtension() {
        return new AudioSourceOptionsExtension();
    }

    /**
     * Create an instance of {@link AudioEncoderConfigurationOption }
     * 
     */
    public AudioEncoderConfigurationOption createAudioEncoderConfigurationOption() {
        return new AudioEncoderConfigurationOption();
    }

    /**
     * Create an instance of {@link FocusStatus20 }
     * 
     */
    public FocusStatus20 createFocusStatus20() {
        return new FocusStatus20();
    }

    /**
     * Create an instance of {@link MetadataAttributes }
     * 
     */
    public MetadataAttributes createMetadataAttributes() {
        return new MetadataAttributes();
    }

    /**
     * Create an instance of {@link MetadataConfigurationOptions }
     * 
     */
    public MetadataConfigurationOptions createMetadataConfigurationOptions() {
        return new MetadataConfigurationOptions();
    }

    /**
     * Create an instance of {@link NetworkCapabilitiesExtension }
     * 
     */
    public NetworkCapabilitiesExtension createNetworkCapabilitiesExtension() {
        return new NetworkCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link ColorOptions }
     * 
     */
    public ColorOptions createColorOptions() {
        return new ColorOptions();
    }

    /**
     * Create an instance of {@link ItemListDescriptionExtension }
     * 
     */
    public ItemListDescriptionExtension createItemListDescriptionExtension() {
        return new ItemListDescriptionExtension();
    }

    /**
     * Create an instance of {@link FindPTZPositionResultList }
     * 
     */
    public FindPTZPositionResultList createFindPTZPositionResultList() {
        return new FindPTZPositionResultList();
    }

    /**
     * Create an instance of {@link ProfileStatusExtension }
     * 
     */
    public ProfileStatusExtension createProfileStatusExtension() {
        return new ProfileStatusExtension();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension }
     * 
     */
    public ImagingSettingsExtension createImagingSettingsExtension() {
        return new ImagingSettingsExtension();
    }

    /**
     * Create an instance of {@link AnalyticsCapabilities }
     * 
     */
    public AnalyticsCapabilities createAnalyticsCapabilities() {
        return new AnalyticsCapabilities();
    }

    /**
     * Create an instance of {@link SupportedAnalyticsModules }
     * 
     */
    public SupportedAnalyticsModules createSupportedAnalyticsModules() {
        return new SupportedAnalyticsModules();
    }

    /**
     * Create an instance of {@link TrackConfiguration }
     * 
     */
    public TrackConfiguration createTrackConfiguration() {
        return new TrackConfiguration();
    }

    /**
     * Create an instance of {@link ColorCovariance }
     * 
     */
    public ColorCovariance createColorCovariance() {
        return new ColorCovariance();
    }

    /**
     * Create an instance of {@link RotateOptions }
     * 
     */
    public RotateOptions createRotateOptions() {
        return new RotateOptions();
    }

    /**
     * Create an instance of {@link FocusConfiguration20 }
     * 
     */
    public FocusConfiguration20 createFocusConfiguration20() {
        return new FocusConfiguration20();
    }

    /**
     * Create an instance of {@link MulticastConfiguration }
     * 
     */
    public MulticastConfiguration createMulticastConfiguration() {
        return new MulticastConfiguration();
    }

    /**
     * Create an instance of {@link DeviceEntity }
     * 
     */
    public DeviceEntity createDeviceEntity() {
        return new DeviceEntity();
    }

    /**
     * Create an instance of {@link AnalyticsEngineInput }
     * 
     */
    public AnalyticsEngineInput createAnalyticsEngineInput() {
        return new AnalyticsEngineInput();
    }

    /**
     * Create an instance of {@link H264Options }
     * 
     */
    public H264Options createH264Options() {
        return new H264Options();
    }

    /**
     * Create an instance of {@link ContinuousFocus }
     * 
     */
    public ContinuousFocus createContinuousFocus() {
        return new ContinuousFocus();
    }

    /**
     * Create an instance of {@link SystemCapabilitiesExtension }
     * 
     */
    public SystemCapabilitiesExtension createSystemCapabilitiesExtension() {
        return new SystemCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link PTZStatusFilterOptionsExtension }
     * 
     */
    public PTZStatusFilterOptionsExtension createPTZStatusFilterOptionsExtension() {
        return new PTZStatusFilterOptionsExtension();
    }

    /**
     * Create an instance of {@link StorageReferencePathExtension }
     * 
     */
    public StorageReferencePathExtension createStorageReferencePathExtension() {
        return new StorageReferencePathExtension();
    }

    /**
     * Create an instance of {@link SupportedAnalyticsModulesExtension }
     * 
     */
    public SupportedAnalyticsModulesExtension createSupportedAnalyticsModulesExtension() {
        return new SupportedAnalyticsModulesExtension();
    }

    /**
     * Create an instance of {@link MetadataConfigurationExtension }
     * 
     */
    public MetadataConfigurationExtension createMetadataConfigurationExtension() {
        return new MetadataConfigurationExtension();
    }

    /**
     * Create an instance of {@link EngineConfiguration }
     * 
     */
    public EngineConfiguration createEngineConfiguration() {
        return new EngineConfiguration();
    }

    /**
     * Create an instance of {@link ConfigDescriptionExtension }
     * 
     */
    public ConfigDescriptionExtension createConfigDescriptionExtension() {
        return new ConfigDescriptionExtension();
    }

    /**
     * Create an instance of {@link EapMethodExtension }
     * 
     */
    public EapMethodExtension createEapMethodExtension() {
        return new EapMethodExtension();
    }

    /**
     * Create an instance of {@link StorageReferencePath }
     * 
     */
    public StorageReferencePath createStorageReferencePath() {
        return new StorageReferencePath();
    }

    /**
     * Create an instance of {@link ConfigurationEntity }
     * 
     */
    public ConfigurationEntity createConfigurationEntity() {
        return new ConfigurationEntity();
    }

    /**
     * Create an instance of {@link MessageDescription }
     * 
     */
    public MessageDescription createMessageDescription() {
        return new MessageDescription();
    }

    /**
     * Create an instance of {@link WhiteBalanceOptions20 }
     * 
     */
    public WhiteBalanceOptions20 createWhiteBalanceOptions20() {
        return new WhiteBalanceOptions20();
    }

    /**
     * Create an instance of {@link RecordingJobTrack }
     * 
     */
    public RecordingJobTrack createRecordingJobTrack() {
        return new RecordingJobTrack();
    }

    /**
     * Create an instance of {@link LocalOrientation }
     * 
     */
    public LocalOrientation createLocalOrientation() {
        return new LocalOrientation();
    }

    /**
     * Create an instance of {@link SourceIdentification }
     * 
     */
    public SourceIdentification createSourceIdentification() {
        return new SourceIdentification();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link MessageDescriptionExtension }
     * 
     */
    public MessageDescriptionExtension createMessageDescriptionExtension() {
        return new MessageDescriptionExtension();
    }

    /**
     * Create an instance of {@link ItemListExtension }
     * 
     */
    public ItemListExtension createItemListExtension() {
        return new ItemListExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourOptions }
     * 
     */
    public PTZPresetTourOptions createPTZPresetTourOptions() {
        return new PTZPresetTourOptions();
    }

    /**
     * Create an instance of {@link VideoOutput }
     * 
     */
    public VideoOutput createVideoOutput() {
        return new VideoOutput();
    }

    /**
     * Create an instance of {@link PrefixedIPv6Address }
     * 
     */
    public PrefixedIPv6Address createPrefixedIPv6Address() {
        return new PrefixedIPv6Address();
    }

    /**
     * Create an instance of {@link SearchScope }
     * 
     */
    public SearchScope createSearchScope() {
        return new SearchScope();
    }

    /**
     * Create an instance of {@link OSDTextOptionsExtension }
     * 
     */
    public OSDTextOptionsExtension createOSDTextOptionsExtension() {
        return new OSDTextOptionsExtension();
    }

    /**
     * Create an instance of {@link Include }
     * 
     */
    public Include createInclude() {
        return new Include();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link NotUnderstoodType }
     * 
     */
    public NotUnderstoodType createNotUnderstoodType() {
        return new NotUnderstoodType();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link UpgradeType }
     * 
     */
    public UpgradeType createUpgradeType() {
        return new UpgradeType();
    }

    /**
     * Create an instance of {@link Reasontext }
     * 
     */
    public Reasontext createReasontext() {
        return new Reasontext();
    }

    /**
     * Create an instance of {@link Faultcode }
     * 
     */
    public Faultcode createFaultcode() {
        return new Faultcode();
    }

    /**
     * Create an instance of {@link Faultreason }
     * 
     */
    public Faultreason createFaultreason() {
        return new Faultreason();
    }

    /**
     * Create an instance of {@link Subcode }
     * 
     */
    public Subcode createSubcode() {
        return new Subcode();
    }

    /**
     * Create an instance of {@link SupportedEnvType }
     * 
     */
    public SupportedEnvType createSupportedEnvType() {
        return new SupportedEnvType();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link UpgradeSystemFirmware2 }
     * 
     */
    public UpgradeSystemFirmware2 createUpgradeSystemFirmware2() {
        return new UpgradeSystemFirmware2();
    }

    /**
     * Create an instance of {@link GetSystemUrisResponse2 }
     * 
     */
    public GetSystemUrisResponse2 createGetSystemUrisResponse2() {
        return new GetSystemUrisResponse2();
    }

    /**
     * Create an instance of {@link SetNetworkInterfaces2 }
     * 
     */
    public SetNetworkInterfaces2 createSetNetworkInterfaces2() {
        return new SetNetworkInterfaces2();
    }

    /**
     * Create an instance of {@link SetHostnameFromDHCPResponse2 }
     * 
     */
    public SetHostnameFromDHCPResponse2 createSetHostnameFromDHCPResponse2() {
        return new SetHostnameFromDHCPResponse2();
    }

    /**
     * Create an instance of {@link RestoreSystemResponse2 }
     * 
     */
    public RestoreSystemResponse2 createRestoreSystemResponse2() {
        return new RestoreSystemResponse2();
    }

    /**
     * Create an instance of {@link SetHostname2 }
     * 
     */
    public SetHostname2 createSetHostname2() {
        return new SetHostname2();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse2 }
     * 
     */
    public GetServiceCapabilitiesResponse2 createGetServiceCapabilitiesResponse2() {
        return new GetServiceCapabilitiesResponse2();
    }

    /**
     * Create an instance of {@link GetNetworkProtocols2 }
     * 
     */
    public GetNetworkProtocols2 createGetNetworkProtocols2() {
        return new GetNetworkProtocols2();
    }

    /**
     * Create an instance of {@link GetRemoteUserResponse2 }
     * 
     */
    public GetRemoteUserResponse2 createGetRemoteUserResponse2() {
        return new GetRemoteUserResponse2();
    }

    /**
     * Create an instance of {@link SetNetworkProtocols2 }
     * 
     */
    public SetNetworkProtocols2 createSetNetworkProtocols2() {
        return new SetNetworkProtocols2();
    }

    /**
     * Create an instance of {@link LoadCACertificatesResponse2 }
     * 
     */
    public LoadCACertificatesResponse2 createLoadCACertificatesResponse2() {
        return new LoadCACertificatesResponse2();
    }

    /**
     * Create an instance of {@link CreateStorageConfiguration2 }
     * 
     */
    public CreateStorageConfiguration2 createCreateStorageConfiguration2() {
        return new CreateStorageConfiguration2();
    }

    /**
     * Create an instance of {@link SetDynamicDNS2 }
     * 
     */
    public SetDynamicDNS2 createSetDynamicDNS2() {
        return new SetDynamicDNS2();
    }

    /**
     * Create an instance of {@link SetSystemFactoryDefaultResponse2 }
     * 
     */
    public SetSystemFactoryDefaultResponse2 createSetSystemFactoryDefaultResponse2() {
        return new SetSystemFactoryDefaultResponse2();
    }

    /**
     * Create an instance of {@link SetZeroConfiguration2 }
     * 
     */
    public SetZeroConfiguration2 createSetZeroConfiguration2() {
        return new SetZeroConfiguration2();
    }

    /**
     * Create an instance of {@link DeleteStorageConfiguration2 }
     * 
     */
    public DeleteStorageConfiguration2 createDeleteStorageConfiguration2() {
        return new DeleteStorageConfiguration2();
    }

    /**
     * Create an instance of {@link GetNetworkDefaultGatewayResponse2 }
     * 
     */
    public GetNetworkDefaultGatewayResponse2 createGetNetworkDefaultGatewayResponse2() {
        return new GetNetworkDefaultGatewayResponse2();
    }

    /**
     * Create an instance of {@link GetUsers2 }
     * 
     */
    public GetUsers2 createGetUsers2() {
        return new GetUsers2();
    }

    /**
     * Create an instance of {@link LoadCertificatesResponse2 }
     * 
     */
    public LoadCertificatesResponse2 createLoadCertificatesResponse2() {
        return new LoadCertificatesResponse2();
    }

    /**
     * Create an instance of {@link SetSystemFactoryDefault2 }
     * 
     */
    public SetSystemFactoryDefault2 createSetSystemFactoryDefault2() {
        return new SetSystemFactoryDefault2();
    }

    /**
     * Create an instance of {@link GetSystemBackupResponse2 }
     * 
     */
    public GetSystemBackupResponse2 createGetSystemBackupResponse2() {
        return new GetSystemBackupResponse2();
    }

    /**
     * Create an instance of {@link GetDNSResponse2 }
     * 
     */
    public GetDNSResponse2 createGetDNSResponse2() {
        return new GetDNSResponse2();
    }

    /**
     * Create an instance of {@link GetRemoteDiscoveryMode2 }
     * 
     */
    public GetRemoteDiscoveryMode2 createGetRemoteDiscoveryMode2() {
        return new GetRemoteDiscoveryMode2();
    }

    /**
     * Create an instance of {@link GetHostnameResponse2 }
     * 
     */
    public GetHostnameResponse2 createGetHostnameResponse2() {
        return new GetHostnameResponse2();
    }

    /**
     * Create an instance of {@link SetHostnameResponse2 }
     * 
     */
    public SetHostnameResponse2 createSetHostnameResponse2() {
        return new SetHostnameResponse2();
    }

    /**
     * Create an instance of {@link SetUser2 }
     * 
     */
    public SetUser2 createSetUser2() {
        return new SetUser2();
    }

    /**
     * Create an instance of {@link SystemRebootResponse2 }
     * 
     */
    public SystemRebootResponse2 createSystemRebootResponse2() {
        return new SystemRebootResponse2();
    }

    /**
     * Create an instance of {@link DeleteGeoLocationResponse2 }
     * 
     */
    public DeleteGeoLocationResponse2 createDeleteGeoLocationResponse2() {
        return new DeleteGeoLocationResponse2();
    }

    /**
     * Create an instance of {@link GetSystemSupportInformationResponse2 }
     * 
     */
    public GetSystemSupportInformationResponse2 createGetSystemSupportInformationResponse2() {
        return new GetSystemSupportInformationResponse2();
    }

    /**
     * Create an instance of {@link SendAuxiliaryCommand2 }
     * 
     */
    public SendAuxiliaryCommand2 createSendAuxiliaryCommand2() {
        return new SendAuxiliaryCommand2();
    }

    /**
     * Create an instance of {@link GetZeroConfiguration2 }
     * 
     */
    public GetZeroConfiguration2 createGetZeroConfiguration2() {
        return new GetZeroConfiguration2();
    }

    /**
     * Create an instance of {@link GetDot11Status2 }
     * 
     */
    public GetDot11Status2 createGetDot11Status2() {
        return new GetDot11Status2();
    }

    /**
     * Create an instance of {@link GetRemoteDiscoveryModeResponse2 }
     * 
     */
    public GetRemoteDiscoveryModeResponse2 createGetRemoteDiscoveryModeResponse2() {
        return new GetRemoteDiscoveryModeResponse2();
    }

    /**
     * Create an instance of {@link CreateStorageConfigurationResponse2 }
     * 
     */
    public CreateStorageConfigurationResponse2 createCreateStorageConfigurationResponse2() {
        return new CreateStorageConfigurationResponse2();
    }

    /**
     * Create an instance of {@link SetRelayOutputSettings2 }
     * 
     */
    public SetRelayOutputSettings2 createSetRelayOutputSettings2() {
        return new SetRelayOutputSettings2();
    }

    /**
     * Create an instance of {@link CreateDot1XConfiguration2 }
     * 
     */
    public CreateDot1XConfiguration2 createCreateDot1XConfiguration2() {
        return new CreateDot1XConfiguration2();
    }

    /**
     * Create an instance of {@link SetSystemDateAndTimeResponse2 }
     * 
     */
    public SetSystemDateAndTimeResponse2 createSetSystemDateAndTimeResponse2() {
        return new SetSystemDateAndTimeResponse2();
    }

    /**
     * Create an instance of {@link AddIPAddressFilterResponse2 }
     * 
     */
    public AddIPAddressFilterResponse2 createAddIPAddressFilterResponse2() {
        return new AddIPAddressFilterResponse2();
    }

    /**
     * Create an instance of {@link GetStorageConfigurationResponse2 }
     * 
     */
    public GetStorageConfigurationResponse2 createGetStorageConfigurationResponse2() {
        return new GetStorageConfigurationResponse2();
    }

    /**
     * Create an instance of {@link GetCertificatesResponse2 }
     * 
     */
    public GetCertificatesResponse2 createGetCertificatesResponse2() {
        return new GetCertificatesResponse2();
    }

    /**
     * Create an instance of {@link GetCertificatesStatus2 }
     * 
     */
    public GetCertificatesStatus2 createGetCertificatesStatus2() {
        return new GetCertificatesStatus2();
    }

    /**
     * Create an instance of {@link GetZeroConfigurationResponse2 }
     * 
     */
    public GetZeroConfigurationResponse2 createGetZeroConfigurationResponse2() {
        return new GetZeroConfigurationResponse2();
    }

    /**
     * Create an instance of {@link SetDiscoveryMode2 }
     * 
     */
    public SetDiscoveryMode2 createSetDiscoveryMode2() {
        return new SetDiscoveryMode2();
    }

    /**
     * Create an instance of {@link SetStorageConfigurationResponse2 }
     * 
     */
    public SetStorageConfigurationResponse2 createSetStorageConfigurationResponse2() {
        return new SetStorageConfigurationResponse2();
    }

    /**
     * Create an instance of {@link GetDot1XConfigurationResponse2 }
     * 
     */
    public GetDot1XConfigurationResponse2 createGetDot1XConfigurationResponse2() {
        return new GetDot1XConfigurationResponse2();
    }

    /**
     * Create an instance of {@link SetIPAddressFilter2 }
     * 
     */
    public SetIPAddressFilter2 createSetIPAddressFilter2() {
        return new SetIPAddressFilter2();
    }

    /**
     * Create an instance of {@link GetAccessPolicyResponse2 }
     * 
     */
    public GetAccessPolicyResponse2 createGetAccessPolicyResponse2() {
        return new GetAccessPolicyResponse2();
    }

    /**
     * Create an instance of {@link GetIPAddressFilterResponse2 }
     * 
     */
    public GetIPAddressFilterResponse2 createGetIPAddressFilterResponse2() {
        return new GetIPAddressFilterResponse2();
    }

    /**
     * Create an instance of {@link SetRemoteUserResponse2 }
     * 
     */
    public SetRemoteUserResponse2 createSetRemoteUserResponse2() {
        return new SetRemoteUserResponse2();
    }

    /**
     * Create an instance of {@link SetScopesResponse2 }
     * 
     */
    public SetScopesResponse2 createSetScopesResponse2() {
        return new SetScopesResponse2();
    }

    /**
     * Create an instance of {@link GetNetworkInterfaces2 }
     * 
     */
    public GetNetworkInterfaces2 createGetNetworkInterfaces2() {
        return new GetNetworkInterfaces2();
    }

    /**
     * Create an instance of {@link RemoveIPAddressFilterResponse2 }
     * 
     */
    public RemoveIPAddressFilterResponse2 createRemoveIPAddressFilterResponse2() {
        return new RemoveIPAddressFilterResponse2();
    }

    /**
     * Create an instance of {@link SetDiscoveryModeResponse2 }
     * 
     */
    public SetDiscoveryModeResponse2 createSetDiscoveryModeResponse2() {
        return new SetDiscoveryModeResponse2();
    }

    /**
     * Create an instance of {@link SetNetworkProtocolsResponse2 }
     * 
     */
    public SetNetworkProtocolsResponse2 createSetNetworkProtocolsResponse2() {
        return new SetNetworkProtocolsResponse2();
    }

    /**
     * Create an instance of {@link GetClientCertificateModeResponse2 }
     * 
     */
    public GetClientCertificateModeResponse2 createGetClientCertificateModeResponse2() {
        return new GetClientCertificateModeResponse2();
    }

    /**
     * Create an instance of {@link SetRemoteUser2 }
     * 
     */
    public SetRemoteUser2 createSetRemoteUser2() {
        return new SetRemoteUser2();
    }

    /**
     * Create an instance of {@link GetSystemDateAndTime2 }
     * 
     */
    public GetSystemDateAndTime2 createGetSystemDateAndTime2() {
        return new GetSystemDateAndTime2();
    }

    /**
     * Create an instance of {@link StartSystemRestoreResponse2 }
     * 
     */
    public StartSystemRestoreResponse2 createStartSystemRestoreResponse2() {
        return new StartSystemRestoreResponse2();
    }

    /**
     * Create an instance of {@link GetCertificates2 }
     * 
     */
    public GetCertificates2 createGetCertificates2() {
        return new GetCertificates2();
    }

    /**
     * Create an instance of {@link SetDot1XConfigurationResponse2 }
     * 
     */
    public SetDot1XConfigurationResponse2 createSetDot1XConfigurationResponse2() {
        return new SetDot1XConfigurationResponse2();
    }

    /**
     * Create an instance of {@link GetStorageConfigurations2 }
     * 
     */
    public GetStorageConfigurations2 createGetStorageConfigurations2() {
        return new GetStorageConfigurations2();
    }

    /**
     * Create an instance of {@link CreateUsersResponse2 }
     * 
     */
    public CreateUsersResponse2 createCreateUsersResponse2() {
        return new CreateUsersResponse2();
    }

    /**
     * Create an instance of {@link GetHostname2 }
     * 
     */
    public GetHostname2 createGetHostname2() {
        return new GetHostname2();
    }

    /**
     * Create an instance of {@link SetNetworkDefaultGateway2 }
     * 
     */
    public SetNetworkDefaultGateway2 createSetNetworkDefaultGateway2() {
        return new SetNetworkDefaultGateway2();
    }

    /**
     * Create an instance of {@link GetPkcs10Request2 }
     * 
     */
    public GetPkcs10Request2 createGetPkcs10Request2() {
        return new GetPkcs10Request2();
    }

    /**
     * Create an instance of {@link GetCapabilitiesResponse2 }
     * 
     */
    public GetCapabilitiesResponse2 createGetCapabilitiesResponse2() {
        return new GetCapabilitiesResponse2();
    }

    /**
     * Create an instance of {@link GetGeoLocation2 }
     * 
     */
    public GetGeoLocation2 createGetGeoLocation2() {
        return new GetGeoLocation2();
    }

    /**
     * Create an instance of {@link DeleteStorageConfigurationResponse2 }
     * 
     */
    public DeleteStorageConfigurationResponse2 createDeleteStorageConfigurationResponse2() {
        return new DeleteStorageConfigurationResponse2();
    }

    /**
     * Create an instance of {@link GetDot1XConfiguration2 }
     * 
     */
    public GetDot1XConfiguration2 createGetDot1XConfiguration2() {
        return new GetDot1XConfiguration2();
    }

    /**
     * Create an instance of {@link GetDot11StatusResponse2 }
     * 
     */
    public GetDot11StatusResponse2 createGetDot11StatusResponse2() {
        return new GetDot11StatusResponse2();
    }

    /**
     * Create an instance of {@link GetDynamicDNS2 }
     * 
     */
    public GetDynamicDNS2 createGetDynamicDNS2() {
        return new GetDynamicDNS2();
    }

    /**
     * Create an instance of {@link ScanAvailableDot11NetworksResponse2 }
     * 
     */
    public ScanAvailableDot11NetworksResponse2 createScanAvailableDot11NetworksResponse2() {
        return new ScanAvailableDot11NetworksResponse2();
    }

    /**
     * Create an instance of {@link GetStorageConfigurationsResponse2 }
     * 
     */
    public GetStorageConfigurationsResponse2 createGetStorageConfigurationsResponse2() {
        return new GetStorageConfigurationsResponse2();
    }

    /**
     * Create an instance of {@link SetRelayOutputState2 }
     * 
     */
    public SetRelayOutputState2 createSetRelayOutputState2() {
        return new SetRelayOutputState2();
    }

    /**
     * Create an instance of {@link GetSystemLog2 }
     * 
     */
    public GetSystemLog2 createGetSystemLog2() {
        return new GetSystemLog2();
    }

    /**
     * Create an instance of {@link SetDNS2 }
     * 
     */
    public SetDNS2 createSetDNS2() {
        return new SetDNS2();
    }

    /**
     * Create an instance of {@link RemoveScopesResponse2 }
     * 
     */
    public RemoveScopesResponse2 createRemoveScopesResponse2() {
        return new RemoveScopesResponse2();
    }

    /**
     * Create an instance of {@link SetSystemDateAndTime2 }
     * 
     */
    public SetSystemDateAndTime2 createSetSystemDateAndTime2() {
        return new SetSystemDateAndTime2();
    }

    /**
     * Create an instance of {@link StartFirmwareUpgradeResponse2 }
     * 
     */
    public StartFirmwareUpgradeResponse2 createStartFirmwareUpgradeResponse2() {
        return new StartFirmwareUpgradeResponse2();
    }

    /**
     * Create an instance of {@link CreateUsers2 }
     * 
     */
    public CreateUsers2 createCreateUsers2() {
        return new CreateUsers2();
    }

    /**
     * Create an instance of {@link GetCapabilities2 }
     * 
     */
    public GetCapabilities2 createGetCapabilities2() {
        return new GetCapabilities2();
    }

    /**
     * Create an instance of {@link GetServiceCapabilities2 }
     * 
     */
    public GetServiceCapabilities2 createGetServiceCapabilities2() {
        return new GetServiceCapabilities2();
    }

    /**
     * Create an instance of {@link SetGeoLocation2 }
     * 
     */
    public SetGeoLocation2 createSetGeoLocation2() {
        return new SetGeoLocation2();
    }

    /**
     * Create an instance of {@link SetClientCertificateModeResponse2 }
     * 
     */
    public SetClientCertificateModeResponse2 createSetClientCertificateModeResponse2() {
        return new SetClientCertificateModeResponse2();
    }

    /**
     * Create an instance of {@link GetScopes2 }
     * 
     */
    public GetScopes2 createGetScopes2() {
        return new GetScopes2();
    }

    /**
     * Create an instance of {@link SetHostnameFromDHCP2 }
     * 
     */
    public SetHostnameFromDHCP2 createSetHostnameFromDHCP2() {
        return new SetHostnameFromDHCP2();
    }

    /**
     * Create an instance of {@link GetDeviceInformationResponse2 }
     * 
     */
    public GetDeviceInformationResponse2 createGetDeviceInformationResponse2() {
        return new GetDeviceInformationResponse2();
    }

    /**
     * Create an instance of {@link LoadCACertificates2 }
     * 
     */
    public LoadCACertificates2 createLoadCACertificates2() {
        return new LoadCACertificates2();
    }

    /**
     * Create an instance of {@link SetStorageConfiguration2 }
     * 
     */
    public SetStorageConfiguration2 createSetStorageConfiguration2() {
        return new SetStorageConfiguration2();
    }

    /**
     * Create an instance of {@link RemoveScopes2 }
     * 
     */
    public RemoveScopes2 createRemoveScopes2() {
        return new RemoveScopes2();
    }

    /**
     * Create an instance of {@link GetRemoteUser2 }
     * 
     */
    public GetRemoteUser2 createGetRemoteUser2() {
        return new GetRemoteUser2();
    }

    /**
     * Create an instance of {@link SetNetworkInterfacesResponse2 }
     * 
     */
    public SetNetworkInterfacesResponse2 createSetNetworkInterfacesResponse2() {
        return new SetNetworkInterfacesResponse2();
    }

    /**
     * Create an instance of {@link GetDNS2 }
     * 
     */
    public GetDNS2 createGetDNS2() {
        return new GetDNS2();
    }

    /**
     * Create an instance of {@link SetDNSResponse2 }
     * 
     */
    public SetDNSResponse2 createSetDNSResponse2() {
        return new SetDNSResponse2();
    }

    /**
     * Create an instance of {@link GetNetworkProtocolsResponse2 }
     * 
     */
    public GetNetworkProtocolsResponse2 createGetNetworkProtocolsResponse2() {
        return new GetNetworkProtocolsResponse2();
    }

    /**
     * Create an instance of {@link SetRelayOutputSettingsResponse2 }
     * 
     */
    public SetRelayOutputSettingsResponse2 createSetRelayOutputSettingsResponse2() {
        return new SetRelayOutputSettingsResponse2();
    }

    /**
     * Create an instance of {@link LoadCertificateWithPrivateKey2 }
     * 
     */
    public LoadCertificateWithPrivateKey2 createLoadCertificateWithPrivateKey2() {
        return new LoadCertificateWithPrivateKey2();
    }

    /**
     * Create an instance of {@link SetUserResponse2 }
     * 
     */
    public SetUserResponse2 createSetUserResponse2() {
        return new SetUserResponse2();
    }

    /**
     * Create an instance of {@link SetCertificatesStatusResponse2 }
     * 
     */
    public SetCertificatesStatusResponse2 createSetCertificatesStatusResponse2() {
        return new SetCertificatesStatusResponse2();
    }

    /**
     * Create an instance of {@link SetNTPResponse2 }
     * 
     */
    public SetNTPResponse2 createSetNTPResponse2() {
        return new SetNTPResponse2();
    }

    /**
     * Create an instance of {@link CreateCertificate2 }
     * 
     */
    public CreateCertificate2 createCreateCertificate2() {
        return new CreateCertificate2();
    }

    /**
     * Create an instance of {@link SendAuxiliaryCommandResponse2 }
     * 
     */
    public SendAuxiliaryCommandResponse2 createSendAuxiliaryCommandResponse2() {
        return new SendAuxiliaryCommandResponse2();
    }

    /**
     * Create an instance of {@link SetDPAddressesResponse2 }
     * 
     */
    public SetDPAddressesResponse2 createSetDPAddressesResponse2() {
        return new SetDPAddressesResponse2();
    }

    /**
     * Create an instance of {@link DeleteUsers2 }
     * 
     */
    public DeleteUsers2 createDeleteUsers2() {
        return new DeleteUsers2();
    }

    /**
     * Create an instance of {@link GetCACertificatesResponse2 }
     * 
     */
    public GetCACertificatesResponse2 createGetCACertificatesResponse2() {
        return new GetCACertificatesResponse2();
    }

    /**
     * Create an instance of {@link GetDiscoveryMode2 }
     * 
     */
    public GetDiscoveryMode2 createGetDiscoveryMode2() {
        return new GetDiscoveryMode2();
    }

    /**
     * Create an instance of {@link RemoveIPAddressFilter2 }
     * 
     */
    public RemoveIPAddressFilter2 createRemoveIPAddressFilter2() {
        return new RemoveIPAddressFilter2();
    }

    /**
     * Create an instance of {@link SetAccessPolicyResponse2 }
     * 
     */
    public SetAccessPolicyResponse2 createSetAccessPolicyResponse2() {
        return new SetAccessPolicyResponse2();
    }

    /**
     * Create an instance of {@link SetScopes2 }
     * 
     */
    public SetScopes2 createSetScopes2() {
        return new SetScopes2();
    }

    /**
     * Create an instance of {@link UpgradeSystemFirmwareResponse2 }
     * 
     */
    public UpgradeSystemFirmwareResponse2 createUpgradeSystemFirmwareResponse2() {
        return new UpgradeSystemFirmwareResponse2();
    }

    /**
     * Create an instance of {@link SetDynamicDNSResponse2 }
     * 
     */
    public SetDynamicDNSResponse2 createSetDynamicDNSResponse2() {
        return new SetDynamicDNSResponse2();
    }

    /**
     * Create an instance of {@link ScanAvailableDot11Networks2 }
     * 
     */
    public ScanAvailableDot11Networks2 createScanAvailableDot11Networks2() {
        return new ScanAvailableDot11Networks2();
    }

    /**
     * Create an instance of {@link GetCertificateInformationResponse2 }
     * 
     */
    public GetCertificateInformationResponse2 createGetCertificateInformationResponse2() {
        return new GetCertificateInformationResponse2();
    }

    /**
     * Create an instance of {@link GetDot1XConfigurationsResponse2 }
     * 
     */
    public GetDot1XConfigurationsResponse2 createGetDot1XConfigurationsResponse2() {
        return new GetDot1XConfigurationsResponse2();
    }

    /**
     * Create an instance of {@link GetServicesResponse2 }
     * 
     */
    public GetServicesResponse2 createGetServicesResponse2() {
        return new GetServicesResponse2();
    }

    /**
     * Create an instance of {@link GetSystemSupportInformation2 }
     * 
     */
    public GetSystemSupportInformation2 createGetSystemSupportInformation2() {
        return new GetSystemSupportInformation2();
    }

    /**
     * Create an instance of {@link DeleteDot1XConfiguration2 }
     * 
     */
    public DeleteDot1XConfiguration2 createDeleteDot1XConfiguration2() {
        return new DeleteDot1XConfiguration2();
    }

    /**
     * Create an instance of {@link GetSystemBackup2 }
     * 
     */
    public GetSystemBackup2 createGetSystemBackup2() {
        return new GetSystemBackup2();
    }

    /**
     * Create an instance of {@link GetCertificateInformation2 }
     * 
     */
    public GetCertificateInformation2 createGetCertificateInformation2() {
        return new GetCertificateInformation2();
    }

    /**
     * Create an instance of {@link SetIPAddressFilterResponse2 }
     * 
     */
    public SetIPAddressFilterResponse2 createSetIPAddressFilterResponse2() {
        return new SetIPAddressFilterResponse2();
    }

    /**
     * Create an instance of {@link SetRemoteDiscoveryModeResponse2 }
     * 
     */
    public SetRemoteDiscoveryModeResponse2 createSetRemoteDiscoveryModeResponse2() {
        return new SetRemoteDiscoveryModeResponse2();
    }

    /**
     * Create an instance of {@link GetWsdlUrlResponse2 }
     * 
     */
    public GetWsdlUrlResponse2 createGetWsdlUrlResponse2() {
        return new GetWsdlUrlResponse2();
    }

    /**
     * Create an instance of {@link GetClientCertificateMode2 }
     * 
     */
    public GetClientCertificateMode2 createGetClientCertificateMode2() {
        return new GetClientCertificateMode2();
    }

    /**
     * Create an instance of {@link GetDot1XConfigurations2 }
     * 
     */
    public GetDot1XConfigurations2 createGetDot1XConfigurations2() {
        return new GetDot1XConfigurations2();
    }

    /**
     * Create an instance of {@link DeleteCertificates2 }
     * 
     */
    public DeleteCertificates2 createDeleteCertificates2() {
        return new DeleteCertificates2();
    }

    /**
     * Create an instance of {@link CreateCertificateResponse2 }
     * 
     */
    public CreateCertificateResponse2 createCreateCertificateResponse2() {
        return new CreateCertificateResponse2();
    }

    /**
     * Create an instance of {@link SetNTP2 }
     * 
     */
    public SetNTP2 createSetNTP2() {
        return new SetNTP2();
    }

    /**
     * Create an instance of {@link GetAccessPolicy2 }
     * 
     */
    public GetAccessPolicy2 createGetAccessPolicy2() {
        return new GetAccessPolicy2();
    }

    /**
     * Create an instance of {@link GetRelayOutputsResponse2 }
     * 
     */
    public GetRelayOutputsResponse2 createGetRelayOutputsResponse2() {
        return new GetRelayOutputsResponse2();
    }

    /**
     * Create an instance of {@link GetDPAddressesResponse2 }
     * 
     */
    public GetDPAddressesResponse2 createGetDPAddressesResponse2() {
        return new GetDPAddressesResponse2();
    }

    /**
     * Create an instance of {@link GetScopesResponse2 }
     * 
     */
    public GetScopesResponse2 createGetScopesResponse2() {
        return new GetScopesResponse2();
    }

    /**
     * Create an instance of {@link DeleteUsersResponse2 }
     * 
     */
    public DeleteUsersResponse2 createDeleteUsersResponse2() {
        return new DeleteUsersResponse2();
    }

    /**
     * Create an instance of {@link GetNetworkInterfacesResponse2 }
     * 
     */
    public GetNetworkInterfacesResponse2 createGetNetworkInterfacesResponse2() {
        return new GetNetworkInterfacesResponse2();
    }

    /**
     * Create an instance of {@link LoadCertificateWithPrivateKeyResponse2 }
     * 
     */
    public LoadCertificateWithPrivateKeyResponse2 createLoadCertificateWithPrivateKeyResponse2() {
        return new LoadCertificateWithPrivateKeyResponse2();
    }

    /**
     * Create an instance of {@link GetGeoLocationResponse2 }
     * 
     */
    public GetGeoLocationResponse2 createGetGeoLocationResponse2() {
        return new GetGeoLocationResponse2();
    }

    /**
     * Create an instance of {@link AddScopes2 }
     * 
     */
    public AddScopes2 createAddScopes2() {
        return new AddScopes2();
    }

    /**
     * Create an instance of {@link GetNTP2 }
     * 
     */
    public GetNTP2 createGetNTP2() {
        return new GetNTP2();
    }

    /**
     * Create an instance of {@link GetNTPResponse2 }
     * 
     */
    public GetNTPResponse2 createGetNTPResponse2() {
        return new GetNTPResponse2();
    }

    /**
     * Create an instance of {@link DeleteDot1XConfigurationResponse2 }
     * 
     */
    public DeleteDot1XConfigurationResponse2 createDeleteDot1XConfigurationResponse2() {
        return new DeleteDot1XConfigurationResponse2();
    }

    /**
     * Create an instance of {@link SetDPAddresses2 }
     * 
     */
    public SetDPAddresses2 createSetDPAddresses2() {
        return new SetDPAddresses2();
    }

    /**
     * Create an instance of {@link GetStorageConfiguration2 }
     * 
     */
    public GetStorageConfiguration2 createGetStorageConfiguration2() {
        return new GetStorageConfiguration2();
    }

    /**
     * Create an instance of {@link SetCertificatesStatus2 }
     * 
     */
    public SetCertificatesStatus2 createSetCertificatesStatus2() {
        return new SetCertificatesStatus2();
    }

    /**
     * Create an instance of {@link DeleteGeoLocation2 }
     * 
     */
    public DeleteGeoLocation2 createDeleteGeoLocation2() {
        return new DeleteGeoLocation2();
    }

    /**
     * Create an instance of {@link GetNetworkDefaultGateway2 }
     * 
     */
    public GetNetworkDefaultGateway2 createGetNetworkDefaultGateway2() {
        return new GetNetworkDefaultGateway2();
    }

    /**
     * Create an instance of {@link GetCertificatesStatusResponse2 }
     * 
     */
    public GetCertificatesStatusResponse2 createGetCertificatesStatusResponse2() {
        return new GetCertificatesStatusResponse2();
    }

    /**
     * Create an instance of {@link GetDPAddresses2 }
     * 
     */
    public GetDPAddresses2 createGetDPAddresses2() {
        return new GetDPAddresses2();
    }

    /**
     * Create an instance of {@link AddIPAddressFilter2 }
     * 
     */
    public AddIPAddressFilter2 createAddIPAddressFilter2() {
        return new AddIPAddressFilter2();
    }

    /**
     * Create an instance of {@link DeleteCertificatesResponse2 }
     * 
     */
    public DeleteCertificatesResponse2 createDeleteCertificatesResponse2() {
        return new DeleteCertificatesResponse2();
    }

    /**
     * Create an instance of {@link SetRemoteDiscoveryMode2 }
     * 
     */
    public SetRemoteDiscoveryMode2 createSetRemoteDiscoveryMode2() {
        return new SetRemoteDiscoveryMode2();
    }

    /**
     * Create an instance of {@link SystemReboot2 }
     * 
     */
    public SystemReboot2 createSystemReboot2() {
        return new SystemReboot2();
    }

    /**
     * Create an instance of {@link GetServices2 }
     * 
     */
    public GetServices2 createGetServices2() {
        return new GetServices2();
    }

    /**
     * Create an instance of {@link SetDot1XConfiguration2 }
     * 
     */
    public SetDot1XConfiguration2 createSetDot1XConfiguration2() {
        return new SetDot1XConfiguration2();
    }

    /**
     * Create an instance of {@link GetRelayOutputs2 }
     * 
     */
    public GetRelayOutputs2 createGetRelayOutputs2() {
        return new GetRelayOutputs2();
    }

    /**
     * Create an instance of {@link StartFirmwareUpgrade2 }
     * 
     */
    public StartFirmwareUpgrade2 createStartFirmwareUpgrade2() {
        return new StartFirmwareUpgrade2();
    }

    /**
     * Create an instance of {@link SetClientCertificateMode2 }
     * 
     */
    public SetClientCertificateMode2 createSetClientCertificateMode2() {
        return new SetClientCertificateMode2();
    }

    /**
     * Create an instance of {@link SetNetworkDefaultGatewayResponse2 }
     * 
     */
    public SetNetworkDefaultGatewayResponse2 createSetNetworkDefaultGatewayResponse2() {
        return new SetNetworkDefaultGatewayResponse2();
    }

    /**
     * Create an instance of {@link GetDiscoveryModeResponse2 }
     * 
     */
    public GetDiscoveryModeResponse2 createGetDiscoveryModeResponse2() {
        return new GetDiscoveryModeResponse2();
    }

    /**
     * Create an instance of {@link GetCACertificates2 }
     * 
     */
    public GetCACertificates2 createGetCACertificates2() {
        return new GetCACertificates2();
    }

    /**
     * Create an instance of {@link RestoreSystem2 }
     * 
     */
    public RestoreSystem2 createRestoreSystem2() {
        return new RestoreSystem2();
    }

    /**
     * Create an instance of {@link SetRelayOutputStateResponse2 }
     * 
     */
    public SetRelayOutputStateResponse2 createSetRelayOutputStateResponse2() {
        return new SetRelayOutputStateResponse2();
    }

    /**
     * Create an instance of {@link StartSystemRestore2 }
     * 
     */
    public StartSystemRestore2 createStartSystemRestore2() {
        return new StartSystemRestore2();
    }

    /**
     * Create an instance of {@link GetIPAddressFilter2 }
     * 
     */
    public GetIPAddressFilter2 createGetIPAddressFilter2() {
        return new GetIPAddressFilter2();
    }

    /**
     * Create an instance of {@link GetPkcs10RequestResponse2 }
     * 
     */
    public GetPkcs10RequestResponse2 createGetPkcs10RequestResponse2() {
        return new GetPkcs10RequestResponse2();
    }

    /**
     * Create an instance of {@link GetSystemDateAndTimeResponse2 }
     * 
     */
    public GetSystemDateAndTimeResponse2 createGetSystemDateAndTimeResponse2() {
        return new GetSystemDateAndTimeResponse2();
    }

    /**
     * Create an instance of {@link GetSystemLogResponse2 }
     * 
     */
    public GetSystemLogResponse2 createGetSystemLogResponse2() {
        return new GetSystemLogResponse2();
    }

    /**
     * Create an instance of {@link SetAccessPolicy2 }
     * 
     */
    public SetAccessPolicy2 createSetAccessPolicy2() {
        return new SetAccessPolicy2();
    }

    /**
     * Create an instance of {@link GetDynamicDNSResponse2 }
     * 
     */
    public GetDynamicDNSResponse2 createGetDynamicDNSResponse2() {
        return new GetDynamicDNSResponse2();
    }

    /**
     * Create an instance of {@link SetGeoLocationResponse2 }
     * 
     */
    public SetGeoLocationResponse2 createSetGeoLocationResponse2() {
        return new SetGeoLocationResponse2();
    }

    /**
     * Create an instance of {@link CreateDot1XConfigurationResponse2 }
     * 
     */
    public CreateDot1XConfigurationResponse2 createCreateDot1XConfigurationResponse2() {
        return new CreateDot1XConfigurationResponse2();
    }

    /**
     * Create an instance of {@link GetWsdlUrl2 }
     * 
     */
    public GetWsdlUrl2 createGetWsdlUrl2() {
        return new GetWsdlUrl2();
    }

    /**
     * Create an instance of {@link SetZeroConfigurationResponse2 }
     * 
     */
    public SetZeroConfigurationResponse2 createSetZeroConfigurationResponse2() {
        return new SetZeroConfigurationResponse2();
    }

    /**
     * Create an instance of {@link GetDeviceInformation2 }
     * 
     */
    public GetDeviceInformation2 createGetDeviceInformation2() {
        return new GetDeviceInformation2();
    }

    /**
     * Create an instance of {@link LoadCertificates2 }
     * 
     */
    public LoadCertificates2 createLoadCertificates2() {
        return new LoadCertificates2();
    }

    /**
     * Create an instance of {@link AddScopesResponse2 }
     * 
     */
    public AddScopesResponse2 createAddScopesResponse2() {
        return new AddScopesResponse2();
    }

    /**
     * Create an instance of {@link GetUsersResponse2 }
     * 
     */
    public GetUsersResponse2 createGetUsersResponse2() {
        return new GetUsersResponse2();
    }

    /**
     * Create an instance of {@link GetSystemUris2 .Arg3 }
     * 
     */
    public GetSystemUris2 .Arg3 createGetSystemUris2Arg3() {
        return new GetSystemUris2 .Arg3();
    }

    /**
     * Create an instance of {@link GetEndpointReference2 .Arg0 }
     * 
     */
    public GetEndpointReference2 .Arg0 createGetEndpointReference2Arg0() {
        return new GetEndpointReference2 .Arg0();
    }

    /**
     * Create an instance of {@link GetEndpointReferenceResponse2 .Return }
     * 
     */
    public GetEndpointReferenceResponse2 .Return createGetEndpointReferenceResponse2Return() {
        return new GetEndpointReferenceResponse2 .Return();
    }

    /**
     * Create an instance of {@link GetDot11Capabilities2 .Arg0 }
     * 
     */
    public GetDot11Capabilities2 .Arg0 createGetDot11Capabilities2Arg0() {
        return new GetDot11Capabilities2 .Arg0();
    }

    /**
     * Create an instance of {@link GetDot11CapabilitiesResponse2 .Return }
     * 
     */
    public GetDot11CapabilitiesResponse2 .Return createGetDot11CapabilitiesResponse2Return() {
        return new GetDot11CapabilitiesResponse2 .Return();
    }

    /**
     * Create an instance of {@link EventSubscription.SubscriptionPolicy }
     * 
     */
    public EventSubscription.SubscriptionPolicy createEventSubscriptionSubscriptionPolicy() {
        return new EventSubscription.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link ConfigDescription.Messages }
     * 
     */
    public ConfigDescription.Messages createConfigDescriptionMessages() {
        return new ConfigDescription.Messages();
    }

    /**
     * Create an instance of {@link ItemListDescription.SimpleItemDescription }
     * 
     */
    public ItemListDescription.SimpleItemDescription createItemListDescriptionSimpleItemDescription() {
        return new ItemListDescription.SimpleItemDescription();
    }

    /**
     * Create an instance of {@link ItemListDescription.ElementItemDescription }
     * 
     */
    public ItemListDescription.ElementItemDescription createItemListDescriptionElementItemDescription() {
        return new ItemListDescription.ElementItemDescription();
    }

    /**
     * Create an instance of {@link ItemList.SimpleItem }
     * 
     */
    public ItemList.SimpleItem createItemListSimpleItem() {
        return new ItemList.SimpleItem();
    }

    /**
     * Create an instance of {@link ItemList.ElementItem }
     * 
     */
    public ItemList.ElementItem createItemListElementItem() {
        return new ItemList.ElementItem();
    }

    /**
     * Create an instance of {@link UserCredential.Extension }
     * 
     */
    public UserCredential.Extension createUserCredentialExtension() {
        return new UserCredential.Extension();
    }

    /**
     * Create an instance of {@link Service.Capabilities }
     * 
     */
    public Service.Capabilities createServiceCapabilities() {
        return new Service.Capabilities();
    }

    /**
     * Create an instance of {@link StorageConfigurationData.Extension }
     * 
     */
    public StorageConfigurationData.Extension createStorageConfigurationDataExtension() {
        return new StorageConfigurationData.Extension();
    }

    /**
     * Create an instance of {@link TopicNamespaceType.Topic }
     * 
     */
    public TopicNamespaceType.Topic createTopicNamespaceTypeTopic() {
        return new TopicNamespaceType.Topic();
    }

    /**
     * Create an instance of {@link BaseFaultType.ErrorCode }
     * 
     */
    public BaseFaultType.ErrorCode createBaseFaultTypeErrorCode() {
        return new BaseFaultType.ErrorCode();
    }

    /**
     * Create an instance of {@link BaseFaultType.Description }
     * 
     */
    public BaseFaultType.Description createBaseFaultTypeDescription() {
        return new BaseFaultType.Description();
    }

    /**
     * Create an instance of {@link BaseFaultType.FaultCause }
     * 
     */
    public BaseFaultType.FaultCause createBaseFaultTypeFaultCause() {
        return new BaseFaultType.FaultCause();
    }

    /**
     * Create an instance of {@link NotificationMessageHolderType.Message }
     * 
     */
    public NotificationMessageHolderType.Message createNotificationMessageHolderTypeMessage() {
        return new NotificationMessageHolderType.Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot11Capabilities2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot11Capabilities")
    public JAXBElement<GetDot11Capabilities2> createGetDot11Capabilities(GetDot11Capabilities2 value) {
        return new JAXBElement<GetDot11Capabilities2>(_GetDot11Capabilities_QNAME, GetDot11Capabilities2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToDestroySubscriptionFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroySubscriptionFault")
    public JAXBElement<UnableToDestroySubscriptionFaultType> createUnableToDestroySubscriptionFault(UnableToDestroySubscriptionFaultType value) {
        return new JAXBElement<UnableToDestroySubscriptionFaultType>(_UnableToDestroySubscriptionFault_QNAME, UnableToDestroySubscriptionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Include }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2004/08/xop/include", name = "Include")
    public JAXBElement<Include> createInclude(Include value) {
        return new JAXBElement<Include>(_Include_QNAME, Include.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStorageConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createStorageConfigurationResponse")
    public JAXBElement<CreateStorageConfigurationResponse2> createCreateStorageConfigurationResponse(CreateStorageConfigurationResponse2 value) {
        return new JAXBElement<CreateStorageConfigurationResponse2>(_CreateStorageConfigurationResponse_QNAME, CreateStorageConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDot1XConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createDot1XConfiguration")
    public JAXBElement<CreateDot1XConfiguration2> createCreateDot1XConfiguration(CreateDot1XConfiguration2 value) {
        return new JAXBElement<CreateDot1XConfiguration2>(_CreateDot1XConfiguration_QNAME, CreateDot1XConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot1XConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot1XConfigurationResponse")
    public JAXBElement<GetDot1XConfigurationResponse2> createGetDot1XConfigurationResponse(GetDot1XConfigurationResponse2 value) {
        return new JAXBElement<GetDot1XConfigurationResponse2>(_GetDot1XConfigurationResponse_QNAME, GetDot1XConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetIPAddressFilter2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setIPAddressFilter")
    public JAXBElement<SetIPAddressFilter2> createSetIPAddressFilter(SetIPAddressFilter2 value) {
        return new JAXBElement<SetIPAddressFilter2>(_SetIPAddressFilter_QNAME, SetIPAddressFilter2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetScopesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setScopesResponse")
    public JAXBElement<SetScopesResponse2> createSetScopesResponse(SetScopesResponse2 value) {
        return new JAXBElement<SetScopesResponse2>(_SetScopesResponse_QNAME, SetScopesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidProducerPropertiesExpressionFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidProducerPropertiesExpressionFault")
    public JAXBElement<InvalidProducerPropertiesExpressionFaultType> createInvalidProducerPropertiesExpressionFault(InvalidProducerPropertiesExpressionFaultType value) {
        return new JAXBElement<InvalidProducerPropertiesExpressionFaultType>(_InvalidProducerPropertiesExpressionFault_QNAME, InvalidProducerPropertiesExpressionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerReference")
    public JAXBElement<W3CEndpointReference> createProducerReference(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_ProducerReference_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDiscoveryMode2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDiscoveryMode")
    public JAXBElement<SetDiscoveryMode2> createSetDiscoveryMode(SetDiscoveryMode2 value) {
        return new JAXBElement<SetDiscoveryMode2>(_SetDiscoveryMode_QNAME, SetDiscoveryMode2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkProtocols2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNetworkProtocols")
    public JAXBElement<GetNetworkProtocols2> createGetNetworkProtocols(GetNetworkProtocols2 value) {
        return new JAXBElement<GetNetworkProtocols2>(_GetNetworkProtocols_QNAME, GetNetworkProtocols2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemoteUserResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getRemoteUserResponse")
    public JAXBElement<GetRemoteUserResponse2> createGetRemoteUserResponse(GetRemoteUserResponse2 value) {
        return new JAXBElement<GetRemoteUserResponse2>(_GetRemoteUserResponse_QNAME, GetRemoteUserResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCACertificatesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "loadCACertificatesResponse")
    public JAXBElement<LoadCACertificatesResponse2> createLoadCACertificatesResponse(LoadCACertificatesResponse2 value) {
        return new JAXBElement<LoadCACertificatesResponse2>(_LoadCACertificatesResponse_QNAME, LoadCACertificatesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStorageConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createStorageConfiguration")
    public JAXBElement<CreateStorageConfiguration2> createCreateStorageConfiguration(CreateStorageConfiguration2 value) {
        return new JAXBElement<CreateStorageConfiguration2>(_CreateStorageConfiguration_QNAME, CreateStorageConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSystemFactoryDefaultResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setSystemFactoryDefaultResponse")
    public JAXBElement<SetSystemFactoryDefaultResponse2> createSetSystemFactoryDefaultResponse(SetSystemFactoryDefaultResponse2 value) {
        return new JAXBElement<SetSystemFactoryDefaultResponse2>(_SetSystemFactoryDefaultResponse_QNAME, SetSystemFactoryDefaultResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeSystemFirmware2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "upgradeSystemFirmware")
    public JAXBElement<UpgradeSystemFirmware2> createUpgradeSystemFirmware(UpgradeSystemFirmware2 value) {
        return new JAXBElement<UpgradeSystemFirmware2>(_UpgradeSystemFirmware_QNAME, UpgradeSystemFirmware2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemUrisResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemUrisResponse")
    public JAXBElement<GetSystemUrisResponse2> createGetSystemUrisResponse(GetSystemUrisResponse2 value) {
        return new JAXBElement<GetSystemUrisResponse2>(_GetSystemUrisResponse_QNAME, GetSystemUrisResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkInterfaces2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNetworkInterfaces")
    public JAXBElement<SetNetworkInterfaces2> createSetNetworkInterfaces(SetNetworkInterfaces2 value) {
        return new JAXBElement<SetNetworkInterfaces2>(_SetNetworkInterfaces_QNAME, SetNetworkInterfaces2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreSystemResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "restoreSystemResponse")
    public JAXBElement<RestoreSystemResponse2> createRestoreSystemResponse(RestoreSystemResponse2 value) {
        return new JAXBElement<RestoreSystemResponse2>(_RestoreSystemResponse_QNAME, RestoreSystemResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHostname2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setHostname")
    public JAXBElement<SetHostname2> createSetHostname(SetHostname2 value) {
        return new JAXBElement<SetHostname2>(_SetHostname_QNAME, SetHostname2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDNSResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDNSResponse")
    public JAXBElement<GetDNSResponse2> createGetDNSResponse(GetDNSResponse2 value) {
        return new JAXBElement<GetDNSResponse2>(_GetDNSResponse_QNAME, GetDNSResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemoteDiscoveryMode2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getRemoteDiscoveryMode")
    public JAXBElement<GetRemoteDiscoveryMode2> createGetRemoteDiscoveryMode(GetRemoteDiscoveryMode2 value) {
        return new JAXBElement<GetRemoteDiscoveryMode2>(_GetRemoteDiscoveryMode_QNAME, GetRemoteDiscoveryMode2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHostnameResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setHostnameResponse")
    public JAXBElement<SetHostnameResponse2> createSetHostnameResponse(SetHostnameResponse2 value) {
        return new JAXBElement<SetHostnameResponse2>(_SetHostnameResponse_QNAME, SetHostnameResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRebootResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "systemRebootResponse")
    public JAXBElement<SystemRebootResponse2> createSystemRebootResponse(SystemRebootResponse2 value) {
        return new JAXBElement<SystemRebootResponse2>(_SystemRebootResponse_QNAME, SystemRebootResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZeroConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getZeroConfiguration")
    public JAXBElement<GetZeroConfiguration2> createGetZeroConfiguration(GetZeroConfiguration2 value) {
        return new JAXBElement<GetZeroConfiguration2>(_GetZeroConfiguration_QNAME, GetZeroConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CreationTime")
    public JAXBElement<Object> createCreationTime(Object value) {
        return new JAXBElement<Object>(_CreationTime_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Envelope")
    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<Envelope>(_Envelope_QNAME, Envelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "From")
    public JAXBElement<W3CEndpointReference> createFrom(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_From_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCertificatesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "loadCertificatesResponse")
    public JAXBElement<LoadCertificatesResponse2> createLoadCertificatesResponse(LoadCertificatesResponse2 value) {
        return new JAXBElement<LoadCertificatesResponse2>(_LoadCertificatesResponse_QNAME, LoadCertificatesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSystemFactoryDefault2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setSystemFactoryDefault")
    public JAXBElement<SetSystemFactoryDefault2> createSetSystemFactoryDefault(SetSystemFactoryDefault2 value) {
        return new JAXBElement<SetSystemFactoryDefault2>(_SetSystemFactoryDefault_QNAME, SetSystemFactoryDefault2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnacceptableTerminationTimeFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableTerminationTimeFault")
    public JAXBElement<UnacceptableTerminationTimeFaultType> createUnacceptableTerminationTimeFault(UnacceptableTerminationTimeFaultType value) {
        return new JAXBElement<UnacceptableTerminationTimeFaultType>(_UnacceptableTerminationTimeFault_QNAME, UnacceptableTerminationTimeFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveScopesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "removeScopesResponse")
    public JAXBElement<RemoveScopesResponse2> createRemoveScopesResponse(RemoveScopesResponse2 value) {
        return new JAXBElement<RemoveScopesResponse2>(_RemoveScopesResponse_QNAME, RemoveScopesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartFirmwareUpgradeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "startFirmwareUpgradeResponse")
    public JAXBElement<StartFirmwareUpgradeResponse2> createStartFirmwareUpgradeResponse(StartFirmwareUpgradeResponse2 value) {
        return new JAXBElement<StartFirmwareUpgradeResponse2>(_StartFirmwareUpgradeResponse_QNAME, StartFirmwareUpgradeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerProperties")
    public JAXBElement<QueryExpressionType> createProducerProperties(QueryExpressionType value) {
        return new JAXBElement<QueryExpressionType>(_ProducerProperties_QNAME, QueryExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUsers2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createUsers")
    public JAXBElement<CreateUsers2> createCreateUsers(CreateUsers2 value) {
        return new JAXBElement<CreateUsers2>(_CreateUsers_QNAME, CreateUsers2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapabilities2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCapabilities")
    public JAXBElement<GetCapabilities2> createGetCapabilities(GetCapabilities2 value) {
        return new JAXBElement<GetCapabilities2>(_GetCapabilities_QNAME, GetCapabilities2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGeoLocation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setGeoLocation")
    public JAXBElement<SetGeoLocation2> createSetGeoLocation(SetGeoLocation2 value) {
        return new JAXBElement<SetGeoLocation2>(_SetGeoLocation_QNAME, SetGeoLocation2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientCertificateModeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setClientCertificateModeResponse")
    public JAXBElement<SetClientCertificateModeResponse2> createSetClientCertificateModeResponse(SetClientCertificateModeResponse2 value) {
        return new JAXBElement<SetClientCertificateModeResponse2>(_SetClientCertificateModeResponse_QNAME, SetClientCertificateModeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHostnameFromDHCP2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setHostnameFromDHCP")
    public JAXBElement<SetHostnameFromDHCP2> createSetHostnameFromDHCP(SetHostnameFromDHCP2 value) {
        return new JAXBElement<SetHostnameFromDHCP2>(_SetHostnameFromDHCP_QNAME, SetHostnameFromDHCP2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStorageConfigurationsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getStorageConfigurationsResponse")
    public JAXBElement<GetStorageConfigurationsResponse2> createGetStorageConfigurationsResponse(GetStorageConfigurationsResponse2 value) {
        return new JAXBElement<GetStorageConfigurationsResponse2>(_GetStorageConfigurationsResponse_QNAME, GetStorageConfigurationsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ReferenceParameters")
    public JAXBElement<ReferenceParametersType> createReferenceParameters(ReferenceParametersType value) {
        return new JAXBElement<ReferenceParametersType>(_ReferenceParameters_QNAME, ReferenceParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDNS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDNS")
    public JAXBElement<GetDNS2> createGetDNS(GetDNS2 value) {
        return new JAXBElement<GetDNS2>(_GetDNS_QNAME, GetDNS2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceInformationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDeviceInformationResponse")
    public JAXBElement<GetDeviceInformationResponse2> createGetDeviceInformationResponse(GetDeviceInformationResponse2 value) {
        return new JAXBElement<GetDeviceInformationResponse2>(_GetDeviceInformationResponse_QNAME, GetDeviceInformationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveScopes2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "removeScopes")
    public JAXBElement<RemoveScopes2> createRemoveScopes(RemoveScopes2 value) {
        return new JAXBElement<RemoveScopes2>(_RemoveScopes_QNAME, RemoveScopes2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicNotSupportedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicNotSupportedFault")
    public JAXBElement<TopicNotSupportedFaultType> createTopicNotSupportedFault(TopicNotSupportedFaultType value) {
        return new JAXBElement<TopicNotSupportedFaultType>(_TopicNotSupportedFault_QNAME, TopicNotSupportedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkInterfacesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNetworkInterfacesResponse")
    public JAXBElement<SetNetworkInterfacesResponse2> createSetNetworkInterfacesResponse(SetNetworkInterfacesResponse2 value) {
        return new JAXBElement<SetNetworkInterfacesResponse2>(_SetNetworkInterfacesResponse_QNAME, SetNetworkInterfacesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemDateAndTime2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemDateAndTime")
    public JAXBElement<GetSystemDateAndTime2> createGetSystemDateAndTime(GetSystemDateAndTime2 value) {
        return new JAXBElement<GetSystemDateAndTime2>(_GetSystemDateAndTime_QNAME, GetSystemDateAndTime2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartSystemRestoreResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "startSystemRestoreResponse")
    public JAXBElement<StartSystemRestoreResponse2> createStartSystemRestoreResponse(StartSystemRestoreResponse2 value) {
        return new JAXBElement<StartSystemRestoreResponse2>(_StartSystemRestoreResponse_QNAME, StartSystemRestoreResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificates2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCertificates")
    public JAXBElement<GetCertificates2> createGetCertificates(GetCertificates2 value) {
        return new JAXBElement<GetCertificates2>(_GetCertificates_QNAME, GetCertificates2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDot1XConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDot1XConfigurationResponse")
    public JAXBElement<SetDot1XConfigurationResponse2> createSetDot1XConfigurationResponse(SetDot1XConfigurationResponse2 value) {
        return new JAXBElement<SetDot1XConfigurationResponse2>(_SetDot1XConfigurationResponse_QNAME, SetDot1XConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicNamespaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicNamespace")
    public JAXBElement<TopicNamespaceType> createTopicNamespace(TopicNamespaceType value) {
        return new JAXBElement<TopicNamespaceType>(_TopicNamespace_QNAME, TopicNamespaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientCertificateModeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getClientCertificateModeResponse")
    public JAXBElement<GetClientCertificateModeResponse2> createGetClientCertificateModeResponse(GetClientCertificateModeResponse2 value) {
        return new JAXBElement<GetClientCertificateModeResponse2>(_GetClientCertificateModeResponse_QNAME, GetClientCertificateModeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStorageConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteStorageConfigurationResponse")
    public JAXBElement<DeleteStorageConfigurationResponse2> createDeleteStorageConfigurationResponse(DeleteStorageConfigurationResponse2 value) {
        return new JAXBElement<DeleteStorageConfigurationResponse2>(_DeleteStorageConfigurationResponse_QNAME, DeleteStorageConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot11StatusResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot11StatusResponse")
    public JAXBElement<GetDot11StatusResponse2> createGetDot11StatusResponse(GetDot11StatusResponse2 value) {
        return new JAXBElement<GetDot11StatusResponse2>(_GetDot11StatusResponse_QNAME, GetDot11StatusResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUsersResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createUsersResponse")
    public JAXBElement<CreateUsersResponse2> createCreateUsersResponse(CreateUsersResponse2 value) {
        return new JAXBElement<CreateUsersResponse2>(_CreateUsersResponse_QNAME, CreateUsersResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostname2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getHostname")
    public JAXBElement<GetHostname2> createGetHostname(GetHostname2 value) {
        return new JAXBElement<GetHostname2>(_GetHostname_QNAME, GetHostname2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkDefaultGateway2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNetworkDefaultGateway")
    public JAXBElement<SetNetworkDefaultGateway2> createSetNetworkDefaultGateway(SetNetworkDefaultGateway2 value) {
        return new JAXBElement<SetNetworkDefaultGateway2>(_SetNetworkDefaultGateway_QNAME, SetNetworkDefaultGateway2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapabilitiesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCapabilitiesResponse")
    public JAXBElement<GetCapabilitiesResponse2> createGetCapabilitiesResponse(GetCapabilitiesResponse2 value) {
        return new JAXBElement<GetCapabilitiesResponse2>(_GetCapabilitiesResponse_QNAME, GetCapabilitiesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MessageContent")
    public JAXBElement<QueryExpressionType> createMessageContent(QueryExpressionType value) {
        return new JAXBElement<QueryExpressionType>(_MessageContent_QNAME, QueryExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEndpointReference2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getEndpointReference")
    public JAXBElement<GetEndpointReference2> createGetEndpointReference(GetEndpointReference2 value) {
        return new JAXBElement<GetEndpointReference2>(_GetEndpointReference_QNAME, GetEndpointReference2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDPAddressesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDPAddressesResponse")
    public JAXBElement<GetDPAddressesResponse2> createGetDPAddressesResponse(GetDPAddressesResponse2 value) {
        return new JAXBElement<GetDPAddressesResponse2>(_GetDPAddressesResponse_QNAME, GetDPAddressesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWsdlUrlResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getWsdlUrlResponse")
    public JAXBElement<GetWsdlUrlResponse2> createGetWsdlUrlResponse(GetWsdlUrlResponse2 value) {
        return new JAXBElement<GetWsdlUrlResponse2>(_GetWsdlUrlResponse_QNAME, GetWsdlUrlResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ConsumerReference")
    public JAXBElement<W3CEndpointReference> createConsumerReference(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_ConsumerReference_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemIRI")
    public JAXBElement<AttributedURIType> createProblemIRI(AttributedURIType value) {
        return new JAXBElement<AttributedURIType>(_ProblemIRI_QNAME, AttributedURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientCertificateMode2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getClientCertificateMode")
    public JAXBElement<GetClientCertificateMode2> createGetClientCertificateMode(GetClientCertificateMode2 value) {
        return new JAXBElement<GetClientCertificateMode2>(_GetClientCertificateMode_QNAME, GetClientCertificateMode2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot1XConfigurations2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot1XConfigurations")
    public JAXBElement<GetDot1XConfigurations2> createGetDot1XConfigurations(GetDot1XConfigurations2 value) {
        return new JAXBElement<GetDot1XConfigurations2>(_GetDot1XConfigurations_QNAME, GetDot1XConfigurations2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoLocationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getGeoLocationResponse")
    public JAXBElement<GetGeoLocationResponse2> createGetGeoLocationResponse(GetGeoLocationResponse2 value) {
        return new JAXBElement<GetGeoLocationResponse2>(_GetGeoLocationResponse_QNAME, GetGeoLocationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDot1XConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteDot1XConfigurationResponse")
    public JAXBElement<DeleteDot1XConfigurationResponse2> createDeleteDot1XConfigurationResponse(DeleteDot1XConfigurationResponse2 value) {
        return new JAXBElement<DeleteDot1XConfigurationResponse2>(_DeleteDot1XConfigurationResponse_QNAME, DeleteDot1XConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCertificateWithPrivateKeyResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "loadCertificateWithPrivateKeyResponse")
    public JAXBElement<LoadCertificateWithPrivateKeyResponse2> createLoadCertificateWithPrivateKeyResponse(LoadCertificateWithPrivateKeyResponse2 value) {
        return new JAXBElement<LoadCertificateWithPrivateKeyResponse2>(_LoadCertificateWithPrivateKeyResponse_QNAME, LoadCertificateWithPrivateKeyResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscoveryMode2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDiscoveryMode")
    public JAXBElement<GetDiscoveryMode2> createGetDiscoveryMode(GetDiscoveryMode2 value) {
        return new JAXBElement<GetDiscoveryMode2>(_GetDiscoveryMode_QNAME, GetDiscoveryMode2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkProtocolsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNetworkProtocolsResponse")
    public JAXBElement<GetNetworkProtocolsResponse2> createGetNetworkProtocolsResponse(GetNetworkProtocolsResponse2 value) {
        return new JAXBElement<GetNetworkProtocolsResponse2>(_GetNetworkProtocolsResponse_QNAME, GetNetworkProtocolsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRelayOutputSettingsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRelayOutputSettingsResponse")
    public JAXBElement<SetRelayOutputSettingsResponse2> createSetRelayOutputSettingsResponse(SetRelayOutputSettingsResponse2 value) {
        return new JAXBElement<SetRelayOutputSettingsResponse2>(_SetRelayOutputSettingsResponse_QNAME, SetRelayOutputSettingsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidFilterFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidFilterFault")
    public JAXBElement<InvalidFilterFaultType> createInvalidFilterFault(InvalidFilterFaultType value) {
        return new JAXBElement<InvalidFilterFaultType>(_InvalidFilterFault_QNAME, InvalidFilterFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAuxiliaryCommandResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "sendAuxiliaryCommandResponse")
    public JAXBElement<SendAuxiliaryCommandResponse2> createSendAuxiliaryCommandResponse(SendAuxiliaryCommandResponse2 value) {
        return new JAXBElement<SendAuxiliaryCommandResponse2>(_SendAuxiliaryCommandResponse_QNAME, SendAuxiliaryCommandResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDPAddressesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDPAddressesResponse")
    public JAXBElement<SetDPAddressesResponse2> createSetDPAddressesResponse(SetDPAddressesResponse2 value) {
        return new JAXBElement<SetDPAddressesResponse2>(_SetDPAddressesResponse_QNAME, SetDPAddressesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionReference")
    public JAXBElement<W3CEndpointReference> createSubscriptionReference(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_SubscriptionReference_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServicesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getServicesResponse")
    public JAXBElement<GetServicesResponse2> createGetServicesResponse(GetServicesResponse2 value) {
        return new JAXBElement<GetServicesResponse2>(_GetServicesResponse_QNAME, GetServicesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemSupportInformation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemSupportInformation")
    public JAXBElement<GetSystemSupportInformation2> createGetSystemSupportInformation(GetSystemSupportInformation2 value) {
        return new JAXBElement<GetSystemSupportInformation2>(_GetSystemSupportInformation_QNAME, GetSystemSupportInformation2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemBackup2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemBackup")
    public JAXBElement<GetSystemBackup2> createGetSystemBackup(GetSystemBackup2 value) {
        return new JAXBElement<GetSystemBackup2>(_GetSystemBackup_QNAME, GetSystemBackup2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedUnsignedLongType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "RetryAfter")
    public JAXBElement<AttributedUnsignedLongType> createRetryAfter(AttributedUnsignedLongType value) {
        return new JAXBElement<AttributedUnsignedLongType>(_RetryAfter_QNAME, AttributedUnsignedLongType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataConfiguration")
    public JAXBElement<MetadataConfiguration> createMetadataConfiguration(MetadataConfiguration value) {
        return new JAXBElement<MetadataConfiguration>(_MetadataConfiguration_QNAME, MetadataConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDynamicDNSResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDynamicDNSResponse")
    public JAXBElement<SetDynamicDNSResponse2> createSetDynamicDNSResponse(SetDynamicDNSResponse2 value) {
        return new JAXBElement<SetDynamicDNSResponse2>(_SetDynamicDNSResponse_QNAME, SetDynamicDNSResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificateInformationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCertificateInformationResponse")
    public JAXBElement<GetCertificateInformationResponse2> createGetCertificateInformationResponse(GetCertificateInformationResponse2 value) {
        return new JAXBElement<GetCertificateInformationResponse2>(_GetCertificateInformationResponse_QNAME, GetCertificateInformationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartSystemRestore2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "startSystemRestore")
    public JAXBElement<StartSystemRestore2> createStartSystemRestore(StartSystemRestore2 value) {
        return new JAXBElement<StartSystemRestore2>(_StartSystemRestore_QNAME, StartSystemRestore2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreSystem2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "restoreSystem")
    public JAXBElement<RestoreSystem2> createRestoreSystem(RestoreSystem2 value) {
        return new JAXBElement<RestoreSystem2>(_RestoreSystem_QNAME, RestoreSystem2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRelayOutputStateResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRelayOutputStateResponse")
    public JAXBElement<SetRelayOutputStateResponse2> createSetRelayOutputStateResponse(SetRelayOutputStateResponse2 value) {
        return new JAXBElement<SetRelayOutputStateResponse2>(_SetRelayOutputStateResponse_QNAME, SetRelayOutputStateResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "FaultTo")
    public JAXBElement<W3CEndpointReference> createFaultTo(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_FaultTo_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCertificates2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "loadCertificates")
    public JAXBElement<LoadCertificates2> createLoadCertificates(LoadCertificates2 value) {
        return new JAXBElement<LoadCertificates2>(_LoadCertificates_QNAME, LoadCertificates2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScopesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "addScopesResponse")
    public JAXBElement<AddScopesResponse2> createAddScopesResponse(AddScopesResponse2 value) {
        return new JAXBElement<AddScopesResponse2>(_AddScopesResponse_QNAME, AddScopesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PauseFailedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "PauseFailedFault")
    public JAXBElement<PauseFailedFaultType> createPauseFailedFault(PauseFailedFaultType value) {
        return new JAXBElement<PauseFailedFaultType>(_PauseFailedFault_QNAME, PauseFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToDestroyPullPointFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroyPullPointFault")
    public JAXBElement<UnableToDestroyPullPointFaultType> createUnableToDestroyPullPointFault(UnableToDestroyPullPointFaultType value) {
        return new JAXBElement<UnableToDestroyPullPointFaultType>(_UnableToDestroyPullPointFault_QNAME, UnableToDestroyPullPointFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polyline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polyline")
    public JAXBElement<Polyline> createPolyline(Polyline value) {
        return new JAXBElement<Polyline>(_Polyline_QNAME, Polyline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemDateAndTimeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemDateAndTimeResponse")
    public JAXBElement<GetSystemDateAndTimeResponse2> createGetSystemDateAndTimeResponse(GetSystemDateAndTimeResponse2 value) {
        return new JAXBElement<GetSystemDateAndTimeResponse2>(_GetSystemDateAndTimeResponse_QNAME, GetSystemDateAndTimeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPolicy2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setAccessPolicy")
    public JAXBElement<SetAccessPolicy2> createSetAccessPolicy(SetAccessPolicy2 value) {
        return new JAXBElement<SetAccessPolicy2>(_SetAccessPolicy_QNAME, SetAccessPolicy2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGeoLocationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setGeoLocationResponse")
    public JAXBElement<SetGeoLocationResponse2> createSetGeoLocationResponse(SetGeoLocationResponse2 value) {
        return new JAXBElement<SetGeoLocationResponse2>(_SetGeoLocationResponse_QNAME, SetGeoLocationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDot1XConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createDot1XConfigurationResponse")
    public JAXBElement<CreateDot1XConfigurationResponse2> createCreateDot1XConfigurationResponse(CreateDot1XConfigurationResponse2 value) {
        return new JAXBElement<CreateDot1XConfigurationResponse2>(_CreateDot1XConfigurationResponse_QNAME, CreateDot1XConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWsdlUrl2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getWsdlUrl")
    public JAXBElement<GetWsdlUrl2> createGetWsdlUrl(GetWsdlUrl2 value) {
        return new JAXBElement<GetWsdlUrl2>(_GetWsdlUrl_QNAME, GetWsdlUrl2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetZeroConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setZeroConfigurationResponse")
    public JAXBElement<SetZeroConfigurationResponse2> createSetZeroConfigurationResponse(SetZeroConfigurationResponse2 value) {
        return new JAXBElement<SetZeroConfigurationResponse2>(_SetZeroConfigurationResponse_QNAME, SetZeroConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStorageConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getStorageConfiguration")
    public JAXBElement<GetStorageConfiguration2> createGetStorageConfiguration(GetStorageConfiguration2 value) {
        return new JAXBElement<GetStorageConfiguration2>(_GetStorageConfiguration_QNAME, GetStorageConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProblemActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemAction")
    public JAXBElement<ProblemActionType> createProblemAction(ProblemActionType value) {
        return new JAXBElement<ProblemActionType>(_ProblemAction_QNAME, ProblemActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicSet")
    public JAXBElement<TopicSetType> createTopicSet(TopicSetType value) {
        return new JAXBElement<TopicSetType>(_TopicSet_QNAME, TopicSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTopicsSpecifiedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MultipleTopicsSpecifiedFault")
    public JAXBElement<MultipleTopicsSpecifiedFaultType> createMultipleTopicsSpecifiedFault(MultipleTopicsSpecifiedFaultType value) {
        return new JAXBElement<MultipleTopicsSpecifiedFaultType>(_MultipleTopicsSpecifiedFault_QNAME, MultipleTopicsSpecifiedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDPAddresses2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDPAddresses")
    public JAXBElement<SetDPAddresses2> createSetDPAddresses(SetDPAddresses2 value) {
        return new JAXBElement<SetDPAddresses2>(_SetDPAddresses_QNAME, SetDPAddresses2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRemoteDiscoveryMode2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRemoteDiscoveryMode")
    public JAXBElement<SetRemoteDiscoveryMode2> createSetRemoteDiscoveryMode(SetRemoteDiscoveryMode2 value) {
        return new JAXBElement<SetRemoteDiscoveryMode2>(_SetRemoteDiscoveryMode_QNAME, SetRemoteDiscoveryMode2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemReboot2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "systemReboot")
    public JAXBElement<SystemReboot2> createSystemReboot(SystemReboot2 value) {
        return new JAXBElement<SystemReboot2>(_SystemReboot_QNAME, SystemReboot2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDot1XConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDot1XConfiguration")
    public JAXBElement<SetDot1XConfiguration2> createSetDot1XConfiguration(SetDot1XConfiguration2 value) {
        return new JAXBElement<SetDot1XConfiguration2>(_SetDot1XConfiguration_QNAME, SetDot1XConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Filter")
    public JAXBElement<FilterType> createFilter(FilterType value) {
        return new JAXBElement<FilterType>(_Filter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotUnderstoodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "NotUnderstood")
    public JAXBElement<NotUnderstoodType> createNotUnderstood(NotUnderstoodType value) {
        return new JAXBElement<NotUnderstoodType>(_NotUnderstood_QNAME, NotUnderstoodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGeoLocation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteGeoLocation")
    public JAXBElement<DeleteGeoLocation2> createDeleteGeoLocation(DeleteGeoLocation2 value) {
        return new JAXBElement<DeleteGeoLocation2>(_DeleteGeoLocation_QNAME, DeleteGeoLocation2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CurrentTime")
    public JAXBElement<Object> createCurrentTime(Object value) {
        return new JAXBElement<Object>(_CurrentTime_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Upgrade")
    public JAXBElement<UpgradeType> createUpgrade(UpgradeType value) {
        return new JAXBElement<UpgradeType>(_Upgrade_QNAME, UpgradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDPAddresses2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDPAddresses")
    public JAXBElement<GetDPAddresses2> createGetDPAddresses(GetDPAddresses2 value) {
        return new JAXBElement<GetDPAddresses2>(_GetDPAddresses_QNAME, GetDPAddresses2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidMessageContentExpressionFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidMessageContentExpressionFault")
    public JAXBElement<InvalidMessageContentExpressionFaultType> createInvalidMessageContentExpressionFault(InvalidMessageContentExpressionFaultType value) {
        return new JAXBElement<InvalidMessageContentExpressionFaultType>(_InvalidMessageContentExpressionFault_QNAME, InvalidMessageContentExpressionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polygon")
    public JAXBElement<Polygon> createPolygon(Polygon value) {
        return new JAXBElement<Polygon>(_Polygon_QNAME, Polygon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCertificatesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteCertificatesResponse")
    public JAXBElement<DeleteCertificatesResponse2> createDeleteCertificatesResponse(DeleteCertificatesResponse2 value) {
        return new JAXBElement<DeleteCertificatesResponse2>(_DeleteCertificatesResponse_QNAME, DeleteCertificatesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionDialectUnknownFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialectUnknownFault")
    public JAXBElement<TopicExpressionDialectUnknownFaultType> createTopicExpressionDialectUnknownFault(TopicExpressionDialectUnknownFaultType value) {
        return new JAXBElement<TopicExpressionDialectUnknownFaultType>(_TopicExpressionDialectUnknownFault_QNAME, TopicExpressionDialectUnknownFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSystemDateAndTimeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setSystemDateAndTimeResponse")
    public JAXBElement<SetSystemDateAndTimeResponse2> createSetSystemDateAndTimeResponse(SetSystemDateAndTimeResponse2 value) {
        return new JAXBElement<SetSystemDateAndTimeResponse2>(_SetSystemDateAndTimeResponse_QNAME, SetSystemDateAndTimeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeCreationFailedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscribeCreationFailedFault")
    public JAXBElement<SubscribeCreationFailedFaultType> createSubscribeCreationFailedFault(SubscribeCreationFailedFaultType value) {
        return new JAXBElement<SubscribeCreationFailedFaultType>(_SubscribeCreationFailedFault_QNAME, SubscribeCreationFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIPAddressFilterResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "addIPAddressFilterResponse")
    public JAXBElement<AddIPAddressFilterResponse2> createAddIPAddressFilterResponse(AddIPAddressFilterResponse2 value) {
        return new JAXBElement<AddIPAddressFilterResponse2>(_AddIPAddressFilterResponse_QNAME, AddIPAddressFilterResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStorageConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getStorageConfigurationResponse")
    public JAXBElement<GetStorageConfigurationResponse2> createGetStorageConfigurationResponse(GetStorageConfigurationResponse2 value) {
        return new JAXBElement<GetStorageConfigurationResponse2>(_GetStorageConfigurationResponse_QNAME, GetStorageConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot11Status2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot11Status")
    public JAXBElement<GetDot11Status2> createGetDot11Status(GetDot11Status2 value) {
        return new JAXBElement<GetDot11Status2>(_GetDot11Status_QNAME, GetDot11Status2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemoteDiscoveryModeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getRemoteDiscoveryModeResponse")
    public JAXBElement<GetRemoteDiscoveryModeResponse2> createGetRemoteDiscoveryModeResponse(GetRemoteDiscoveryModeResponse2 value) {
        return new JAXBElement<GetRemoteDiscoveryModeResponse2>(_GetRemoteDiscoveryModeResponse_QNAME, GetRemoteDiscoveryModeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TerminationTime")
    public JAXBElement<Object> createTerminationTime(Object value) {
        return new JAXBElement<Object>(_TerminationTime_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "MessageID")
    public JAXBElement<AttributedURIType> createMessageID(AttributedURIType value) {
        return new JAXBElement<AttributedURIType>(_MessageID_QNAME, AttributedURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRelayOutputSettings2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRelayOutputSettings")
    public JAXBElement<SetRelayOutputSettings2> createSetRelayOutputSettings(SetRelayOutputSettings2 value) {
        return new JAXBElement<SetRelayOutputSettings2>(_SetRelayOutputSettings_QNAME, SetRelayOutputSettings2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoEncoderConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoEncoderConfiguration")
    public JAXBElement<VideoEncoderConfiguration> createVideoEncoderConfiguration(VideoEncoderConfiguration value) {
        return new JAXBElement<VideoEncoderConfiguration>(_VideoEncoderConfiguration_QNAME, VideoEncoderConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "Action")
    public JAXBElement<AttributedURIType> createAction(AttributedURIType value) {
        return new JAXBElement<AttributedURIType>(_Action_QNAME, AttributedURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStorageConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setStorageConfigurationResponse")
    public JAXBElement<SetStorageConfigurationResponse2> createSetStorageConfigurationResponse(SetStorageConfigurationResponse2 value) {
        return new JAXBElement<SetStorageConfigurationResponse2>(_SetStorageConfigurationResponse_QNAME, SetStorageConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPolicyResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getAccessPolicyResponse")
    public JAXBElement<GetAccessPolicyResponse2> createGetAccessPolicyResponse(GetAccessPolicyResponse2 value) {
        return new JAXBElement<GetAccessPolicyResponse2>(_GetAccessPolicyResponse_QNAME, GetAccessPolicyResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIPAddressFilterResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getIPAddressFilterResponse")
    public JAXBElement<GetIPAddressFilterResponse2> createGetIPAddressFilterResponse(GetIPAddressFilterResponse2 value) {
        return new JAXBElement<GetIPAddressFilterResponse2>(_GetIPAddressFilterResponse_QNAME, GetIPAddressFilterResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRemoteUserResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRemoteUserResponse")
    public JAXBElement<SetRemoteUserResponse2> createSetRemoteUserResponse(SetRemoteUserResponse2 value) {
        return new JAXBElement<SetRemoteUserResponse2>(_SetRemoteUserResponse_QNAME, SetRemoteUserResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkInterfaces2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNetworkInterfaces")
    public JAXBElement<GetNetworkInterfaces2> createGetNetworkInterfaces(GetNetworkInterfaces2 value) {
        return new JAXBElement<GetNetworkInterfaces2>(_GetNetworkInterfaces_QNAME, GetNetworkInterfaces2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatesToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "RelatesTo")
    public JAXBElement<RelatesToType> createRelatesTo(RelatesToType value) {
        return new JAXBElement<RelatesToType>(_RelatesTo_QNAME, RelatesToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioSourceConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioSourceConfiguration")
    public JAXBElement<AudioSourceConfiguration> createAudioSourceConfiguration(AudioSourceConfiguration value) {
        return new JAXBElement<AudioSourceConfiguration>(_AudioSourceConfiguration_QNAME, AudioSourceConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificatesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCertificatesResponse")
    public JAXBElement<GetCertificatesResponse2> createGetCertificatesResponse(GetCertificatesResponse2 value) {
        return new JAXBElement<GetCertificatesResponse2>(_GetCertificatesResponse_QNAME, GetCertificatesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificatesStatus2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCertificatesStatus")
    public JAXBElement<GetCertificatesStatus2> createGetCertificatesStatus(GetCertificatesStatus2 value) {
        return new JAXBElement<GetCertificatesStatus2>(_GetCertificatesStatus_QNAME, GetCertificatesStatus2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZeroConfigurationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getZeroConfigurationResponse")
    public JAXBElement<GetZeroConfigurationResponse2> createGetZeroConfigurationResponse(GetZeroConfigurationResponse2 value) {
        return new JAXBElement<GetZeroConfigurationResponse2>(_GetZeroConfigurationResponse_QNAME, GetZeroConfigurationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkProtocols2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNetworkProtocols")
    public JAXBElement<SetNetworkProtocols2> createSetNetworkProtocols(SetNetworkProtocols2 value) {
        return new JAXBElement<SetNetworkProtocols2>(_SetNetworkProtocols_QNAME, SetNetworkProtocols2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDynamicDNS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDynamicDNS")
    public JAXBElement<SetDynamicDNS2> createSetDynamicDNS(SetDynamicDNS2 value) {
        return new JAXBElement<SetDynamicDNS2>(_SetDynamicDNS_QNAME, SetDynamicDNS2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHostnameFromDHCPResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setHostnameFromDHCPResponse")
    public JAXBElement<SetHostnameFromDHCPResponse2> createSetHostnameFromDHCPResponse(SetHostnameFromDHCPResponse2 value) {
        return new JAXBElement<SetHostnameFromDHCPResponse2>(_SetHostnameFromDHCPResponse_QNAME, SetHostnameFromDHCPResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedPolicyRequestFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnsupportedPolicyRequestFault")
    public JAXBElement<UnsupportedPolicyRequestFaultType> createUnsupportedPolicyRequestFault(UnsupportedPolicyRequestFaultType value) {
        return new JAXBElement<UnsupportedPolicyRequestFaultType>(_UnsupportedPolicyRequestFault_QNAME, UnsupportedPolicyRequestFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceCapabilitiesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getServiceCapabilitiesResponse")
    public JAXBElement<GetServiceCapabilitiesResponse2> createGetServiceCapabilitiesResponse(GetServiceCapabilitiesResponse2 value) {
        return new JAXBElement<GetServiceCapabilitiesResponse2>(_GetServiceCapabilitiesResponse_QNAME, GetServiceCapabilitiesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemBackupResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemBackupResponse")
    public JAXBElement<GetSystemBackupResponse2> createGetSystemBackupResponse(GetSystemBackupResponse2 value) {
        return new JAXBElement<GetSystemBackupResponse2>(_GetSystemBackupResponse_QNAME, GetSystemBackupResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostnameResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getHostnameResponse")
    public JAXBElement<GetHostnameResponse2> createGetHostnameResponse(GetHostnameResponse2 value) {
        return new JAXBElement<GetHostnameResponse2>(_GetHostnameResponse_QNAME, GetHostnameResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUser2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setUser")
    public JAXBElement<SetUser2> createSetUser(SetUser2 value) {
        return new JAXBElement<SetUser2>(_SetUser_QNAME, SetUser2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGeoLocationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteGeoLocationResponse")
    public JAXBElement<DeleteGeoLocationResponse2> createDeleteGeoLocationResponse(DeleteGeoLocationResponse2 value) {
        return new JAXBElement<DeleteGeoLocationResponse2>(_DeleteGeoLocationResponse_QNAME, DeleteGeoLocationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemSupportInformationResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemSupportInformationResponse")
    public JAXBElement<GetSystemSupportInformationResponse2> createGetSystemSupportInformationResponse(GetSystemSupportInformationResponse2 value) {
        return new JAXBElement<GetSystemSupportInformationResponse2>(_GetSystemSupportInformationResponse_QNAME, GetSystemSupportInformationResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAuxiliaryCommand2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "sendAuxiliaryCommand")
    public JAXBElement<SendAuxiliaryCommand2> createSendAuxiliaryCommand(SendAuxiliaryCommand2 value) {
        return new JAXBElement<SendAuxiliaryCommand2>(_SendAuxiliaryCommand_QNAME, SendAuxiliaryCommand2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetZeroConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setZeroConfiguration")
    public JAXBElement<SetZeroConfiguration2> createSetZeroConfiguration(SetZeroConfiguration2 value) {
        return new JAXBElement<SetZeroConfiguration2>(_SetZeroConfiguration_QNAME, SetZeroConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/bf-2", name = "BaseFault")
    public JAXBElement<BaseFaultType> createBaseFault(BaseFaultType value) {
        return new JAXBElement<BaseFaultType>(_BaseFault_QNAME, BaseFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStorageConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteStorageConfiguration")
    public JAXBElement<DeleteStorageConfiguration2> createDeleteStorageConfiguration(DeleteStorageConfiguration2 value) {
        return new JAXBElement<DeleteStorageConfiguration2>(_DeleteStorageConfiguration_QNAME, DeleteStorageConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkDefaultGatewayResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNetworkDefaultGatewayResponse")
    public JAXBElement<GetNetworkDefaultGatewayResponse2> createGetNetworkDefaultGatewayResponse(GetNetworkDefaultGatewayResponse2 value) {
        return new JAXBElement<GetNetworkDefaultGatewayResponse2>(_GetNetworkDefaultGatewayResponse_QNAME, GetNetworkDefaultGatewayResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getUsers")
    public JAXBElement<GetUsers2> createGetUsers(GetUsers2 value) {
        return new JAXBElement<GetUsers2>(_GetUsers_QNAME, GetUsers2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot11CapabilitiesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot11CapabilitiesResponse")
    public JAXBElement<GetDot11CapabilitiesResponse2> createGetDot11CapabilitiesResponse(GetDot11CapabilitiesResponse2 value) {
        return new JAXBElement<GetDot11CapabilitiesResponse2>(_GetDot11CapabilitiesResponse_QNAME, GetDot11CapabilitiesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceServiceCapabilities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/device/wsdl", name = "Capabilities")
    public JAXBElement<DeviceServiceCapabilities> createCapabilities(DeviceServiceCapabilities value) {
        return new JAXBElement<DeviceServiceCapabilities>(_Capabilities_QNAME, DeviceServiceCapabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ReplyTo")
    public JAXBElement<W3CEndpointReference> createReplyTo(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_ReplyTo_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSystemDateAndTime2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setSystemDateAndTime")
    public JAXBElement<SetSystemDateAndTime2> createSetSystemDateAndTime(SetSystemDateAndTime2 value) {
        return new JAXBElement<SetSystemDateAndTime2>(_SetSystemDateAndTime_QNAME, SetSystemDateAndTime2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "FixedTopicSet")
    public JAXBElement<Boolean> createFixedTopicSet(Boolean value) {
        return new JAXBElement<Boolean>(_FixedTopicSet_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceCapabilities2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getServiceCapabilities")
    public JAXBElement<GetServiceCapabilities2> createGetServiceCapabilities(GetServiceCapabilities2 value) {
        return new JAXBElement<GetServiceCapabilities2>(_GetServiceCapabilities_QNAME, GetServiceCapabilities2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedQNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemHeaderQName")
    public JAXBElement<AttributedQNameType> createProblemHeaderQName(AttributedQNameType value) {
        return new JAXBElement<AttributedQNameType>(_ProblemHeaderQName_QNAME, AttributedQNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopes2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getScopes")
    public JAXBElement<GetScopes2> createGetScopes(GetScopes2 value) {
        return new JAXBElement<GetScopes2>(_GetScopes_QNAME, GetScopes2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "To")
    public JAXBElement<AttributedURIType> createTo(AttributedURIType value) {
        return new JAXBElement<AttributedURIType>(_To_QNAME, AttributedURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRelayOutputState2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRelayOutputState")
    public JAXBElement<SetRelayOutputState2> createSetRelayOutputState(SetRelayOutputState2 value) {
        return new JAXBElement<SetRelayOutputState2>(_SetRelayOutputState_QNAME, SetRelayOutputState2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemLog2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemLog")
    public JAXBElement<GetSystemLog2> createGetSystemLog(GetSystemLog2 value) {
        return new JAXBElement<GetSystemLog2>(_GetSystemLog_QNAME, GetSystemLog2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDNS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDNS")
    public JAXBElement<SetDNS2> createSetDNS(SetDNS2 value) {
        return new JAXBElement<SetDNS2>(_SetDNS_QNAME, SetDNS2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDNSResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDNSResponse")
    public JAXBElement<SetDNSResponse2> createSetDNSResponse(SetDNSResponse2 value) {
        return new JAXBElement<SetDNSResponse2>(_SetDNSResponse_QNAME, SetDNSResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnacceptableInitialTerminationTimeFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableInitialTerminationTimeFault")
    public JAXBElement<UnacceptableInitialTerminationTimeFaultType> createUnacceptableInitialTerminationTimeFault(UnacceptableInitialTerminationTimeFaultType value) {
        return new JAXBElement<UnacceptableInitialTerminationTimeFaultType>(_UnacceptableInitialTerminationTimeFault_QNAME, UnacceptableInitialTerminationTimeFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCACertificates2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "loadCACertificates")
    public JAXBElement<LoadCACertificates2> createLoadCACertificates(LoadCACertificates2 value) {
        return new JAXBElement<LoadCACertificates2>(_LoadCACertificates_QNAME, LoadCACertificates2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStorageConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setStorageConfiguration")
    public JAXBElement<SetStorageConfiguration2> createSetStorageConfiguration(SetStorageConfiguration2 value) {
        return new JAXBElement<SetStorageConfiguration2>(_SetStorageConfiguration_QNAME, SetStorageConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemoteUser2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getRemoteUser")
    public JAXBElement<GetRemoteUser2> createGetRemoteUser(GetRemoteUser2 value) {
        return new JAXBElement<GetRemoteUser2>(_GetRemoteUser_QNAME, GetRemoteUser2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoAnalyticsConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoAnalyticsConfiguration")
    public JAXBElement<VideoAnalyticsConfiguration> createVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
        return new JAXBElement<VideoAnalyticsConfiguration>(_VideoAnalyticsConfiguration_QNAME, VideoAnalyticsConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStorageConfigurations2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getStorageConfigurations")
    public JAXBElement<GetStorageConfigurations2> createGetStorageConfigurations(GetStorageConfigurations2 value) {
        return new JAXBElement<GetStorageConfigurations2>(_GetStorageConfigurations_QNAME, GetStorageConfigurations2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioDecoderConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioDecoderConfiguration")
    public JAXBElement<AudioDecoderConfiguration> createAudioDecoderConfiguration(AudioDecoderConfiguration value) {
        return new JAXBElement<AudioDecoderConfiguration>(_AudioDecoderConfiguration_QNAME, AudioDecoderConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioOutputConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioOutputConfiguration")
    public JAXBElement<AudioOutputConfiguration> createAudioOutputConfiguration(AudioOutputConfiguration value) {
        return new JAXBElement<AudioOutputConfiguration>(_AudioOutputConfiguration_QNAME, AudioOutputConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIPAddressFilterResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "removeIPAddressFilterResponse")
    public JAXBElement<RemoveIPAddressFilterResponse2> createRemoveIPAddressFilterResponse(RemoveIPAddressFilterResponse2 value) {
        return new JAXBElement<RemoveIPAddressFilterResponse2>(_RemoveIPAddressFilterResponse_QNAME, RemoveIPAddressFilterResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDiscoveryModeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setDiscoveryModeResponse")
    public JAXBElement<SetDiscoveryModeResponse2> createSetDiscoveryModeResponse(SetDiscoveryModeResponse2 value) {
        return new JAXBElement<SetDiscoveryModeResponse2>(_SetDiscoveryModeResponse_QNAME, SetDiscoveryModeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkProtocolsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNetworkProtocolsResponse")
    public JAXBElement<SetNetworkProtocolsResponse2> createSetNetworkProtocolsResponse(SetNetworkProtocolsResponse2 value) {
        return new JAXBElement<SetNetworkProtocolsResponse2>(_SetNetworkProtocolsResponse_QNAME, SetNetworkProtocolsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRemoteUser2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRemoteUser")
    public JAXBElement<SetRemoteUser2> createSetRemoteUser(SetRemoteUser2 value) {
        return new JAXBElement<SetRemoteUser2>(_SetRemoteUser_QNAME, SetRemoteUser2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoLocation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getGeoLocation")
    public JAXBElement<GetGeoLocation2> createGetGeoLocation(GetGeoLocation2 value) {
        return new JAXBElement<GetGeoLocation2>(_GetGeoLocation_QNAME, GetGeoLocation2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot1XConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot1XConfiguration")
    public JAXBElement<GetDot1XConfiguration2> createGetDot1XConfiguration(GetDot1XConfiguration2 value) {
        return new JAXBElement<GetDot1XConfiguration2>(_GetDot1XConfiguration_QNAME, GetDot1XConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDynamicDNS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDynamicDNS")
    public JAXBElement<GetDynamicDNS2> createGetDynamicDNS(GetDynamicDNS2 value) {
        return new JAXBElement<GetDynamicDNS2>(_GetDynamicDNS_QNAME, GetDynamicDNS2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanAvailableDot11NetworksResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "scanAvailableDot11NetworksResponse")
    public JAXBElement<ScanAvailableDot11NetworksResponse2> createScanAvailableDot11NetworksResponse(ScanAvailableDot11NetworksResponse2 value) {
        return new JAXBElement<ScanAvailableDot11NetworksResponse2>(_ScanAvailableDot11NetworksResponse_QNAME, ScanAvailableDot11NetworksResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEndpointReferenceResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getEndpointReferenceResponse")
    public JAXBElement<GetEndpointReferenceResponse2> createGetEndpointReferenceResponse(GetEndpointReferenceResponse2 value) {
        return new JAXBElement<GetEndpointReferenceResponse2>(_GetEndpointReferenceResponse_QNAME, GetEndpointReferenceResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoCurrentMessageOnTopicFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NoCurrentMessageOnTopicFault")
    public JAXBElement<NoCurrentMessageOnTopicFaultType> createNoCurrentMessageOnTopicFault(NoCurrentMessageOnTopicFaultType value) {
        return new JAXBElement<NoCurrentMessageOnTopicFaultType>(_NoCurrentMessageOnTopicFault_QNAME, NoCurrentMessageOnTopicFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToGetMessagesFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToGetMessagesFault")
    public JAXBElement<UnableToGetMessagesFaultType> createUnableToGetMessagesFault(UnableToGetMessagesFaultType value) {
        return new JAXBElement<UnableToGetMessagesFaultType>(_UnableToGetMessagesFault_QNAME, UnableToGetMessagesFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPkcs10Request2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getPkcs10Request")
    public JAXBElement<GetPkcs10Request2> createGetPkcs10Request(GetPkcs10Request2 value) {
        return new JAXBElement<GetPkcs10Request2>(_GetPkcs10Request_QNAME, GetPkcs10Request2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCertificateResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createCertificateResponse")
    public JAXBElement<CreateCertificateResponse2> createCreateCertificateResponse(CreateCertificateResponse2 value) {
        return new JAXBElement<CreateCertificateResponse2>(_CreateCertificateResponse_QNAME, CreateCertificateResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNTP2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNTP")
    public JAXBElement<SetNTP2> createSetNTP(SetNTP2 value) {
        return new JAXBElement<SetNTP2>(_SetNTP_QNAME, SetNTP2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPolicy2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getAccessPolicy")
    public JAXBElement<GetAccessPolicy2> createGetAccessPolicy(GetAccessPolicy2 value) {
        return new JAXBElement<GetAccessPolicy2>(_GetAccessPolicy_QNAME, GetAccessPolicy2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelayOutputsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getRelayOutputsResponse")
    public JAXBElement<GetRelayOutputsResponse2> createGetRelayOutputsResponse(GetRelayOutputsResponse2 value) {
        return new JAXBElement<GetRelayOutputsResponse2>(_GetRelayOutputsResponse_QNAME, GetRelayOutputsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCertificates2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteCertificates")
    public JAXBElement<DeleteCertificates2> createDeleteCertificates(DeleteCertificates2 value) {
        return new JAXBElement<DeleteCertificates2>(_DeleteCertificates_QNAME, DeleteCertificates2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpression")
    public JAXBElement<TopicExpressionType> createTopicExpression(TopicExpressionType value) {
        return new JAXBElement<TopicExpressionType>(_TopicExpression_QNAME, TopicExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToCreatePullPointFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToCreatePullPointFault")
    public JAXBElement<UnableToCreatePullPointFaultType> createUnableToCreatePullPointFault(UnableToCreatePullPointFaultType value) {
        return new JAXBElement<UnableToCreatePullPointFaultType>(_UnableToCreatePullPointFault_QNAME, UnableToCreatePullPointFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScopes2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "addScopes")
    public JAXBElement<AddScopes2> createAddScopes(AddScopes2 value) {
        return new JAXBElement<AddScopes2>(_AddScopes_QNAME, AddScopes2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNTP2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNTP")
    public JAXBElement<GetNTP2> createGetNTP(GetNTP2 value) {
        return new JAXBElement<GetNTP2>(_GetNTP_QNAME, GetNTP2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNTPResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNTPResponse")
    public JAXBElement<GetNTPResponse2> createGetNTPResponse(GetNTPResponse2 value) {
        return new JAXBElement<GetNTPResponse2>(_GetNTPResponse_QNAME, GetNTPResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "Metadata")
    public JAXBElement<MetadataType> createMetadata(MetadataType value) {
        return new JAXBElement<MetadataType>(_Metadata_QNAME, MetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTopicExpressionFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidTopicExpressionFault")
    public JAXBElement<InvalidTopicExpressionFaultType> createInvalidTopicExpressionFault(InvalidTopicExpressionFaultType value) {
        return new JAXBElement<InvalidTopicExpressionFaultType>(_InvalidTopicExpressionFault_QNAME, InvalidTopicExpressionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getScopesResponse")
    public JAXBElement<GetScopesResponse2> createGetScopesResponse(GetScopesResponse2 value) {
        return new JAXBElement<GetScopesResponse2>(_GetScopesResponse_QNAME, GetScopesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsersResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteUsersResponse")
    public JAXBElement<DeleteUsersResponse2> createDeleteUsersResponse(DeleteUsersResponse2 value) {
        return new JAXBElement<DeleteUsersResponse2>(_DeleteUsersResponse_QNAME, DeleteUsersResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkInterfacesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNetworkInterfacesResponse")
    public JAXBElement<GetNetworkInterfacesResponse2> createGetNetworkInterfacesResponse(GetNetworkInterfacesResponse2 value) {
        return new JAXBElement<GetNetworkInterfacesResponse2>(_GetNetworkInterfacesResponse_QNAME, GetNetworkInterfacesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsers2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteUsers")
    public JAXBElement<DeleteUsers2> createDeleteUsers(DeleteUsers2 value) {
        return new JAXBElement<DeleteUsers2>(_DeleteUsers_QNAME, DeleteUsers2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCACertificatesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCACertificatesResponse")
    public JAXBElement<GetCACertificatesResponse2> createGetCACertificatesResponse(GetCACertificatesResponse2 value) {
        return new JAXBElement<GetCACertificatesResponse2>(_GetCACertificatesResponse_QNAME, GetCACertificatesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Body")
    public JAXBElement<Body> createBody(Body value) {
        return new JAXBElement<Body>(_Body_QNAME, Body.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCertificateWithPrivateKey2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "loadCertificateWithPrivateKey")
    public JAXBElement<LoadCertificateWithPrivateKey2> createLoadCertificateWithPrivateKey(LoadCertificateWithPrivateKey2 value) {
        return new JAXBElement<LoadCertificateWithPrivateKey2>(_LoadCertificateWithPrivateKey_QNAME, LoadCertificateWithPrivateKey2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setUserResponse")
    public JAXBElement<SetUserResponse2> createSetUserResponse(SetUserResponse2 value) {
        return new JAXBElement<SetUserResponse2>(_SetUserResponse_QNAME, SetUserResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCertificatesStatusResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setCertificatesStatusResponse")
    public JAXBElement<SetCertificatesStatusResponse2> createSetCertificatesStatusResponse(SetCertificatesStatusResponse2 value) {
        return new JAXBElement<SetCertificatesStatusResponse2>(_SetCertificatesStatusResponse_QNAME, SetCertificatesStatusResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNTPResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNTPResponse")
    public JAXBElement<SetNTPResponse2> createSetNTPResponse(SetNTPResponse2 value) {
        return new JAXBElement<SetNTPResponse2>(_SetNTPResponse_QNAME, SetNTPResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCertificate2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "createCertificate")
    public JAXBElement<CreateCertificate2> createCreateCertificate(CreateCertificate2 value) {
        return new JAXBElement<CreateCertificate2>(_CreateCertificate_QNAME, CreateCertificate2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyMessageNotSupportedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotifyMessageNotSupportedFault")
    public JAXBElement<NotifyMessageNotSupportedFaultType> createNotifyMessageNotSupportedFault(NotifyMessageNotSupportedFaultType value) {
        return new JAXBElement<NotifyMessageNotSupportedFaultType>(_NotifyMessageNotSupportedFault_QNAME, NotifyMessageNotSupportedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDot1XConfiguration2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "deleteDot1XConfiguration")
    public JAXBElement<DeleteDot1XConfiguration2> createDeleteDot1XConfiguration(DeleteDot1XConfiguration2 value) {
        return new JAXBElement<DeleteDot1XConfiguration2>(_DeleteDot1XConfiguration_QNAME, DeleteDot1XConfiguration2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificateInformation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCertificateInformation")
    public JAXBElement<GetCertificateInformation2> createGetCertificateInformation(GetCertificateInformation2 value) {
        return new JAXBElement<GetCertificateInformation2>(_GetCertificateInformation_QNAME, GetCertificateInformation2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetIPAddressFilterResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setIPAddressFilterResponse")
    public JAXBElement<SetIPAddressFilterResponse2> createSetIPAddressFilterResponse(SetIPAddressFilterResponse2 value) {
        return new JAXBElement<SetIPAddressFilterResponse2>(_SetIPAddressFilterResponse_QNAME, SetIPAddressFilterResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRemoteDiscoveryModeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setRemoteDiscoveryModeResponse")
    public JAXBElement<SetRemoteDiscoveryModeResponse2> createSetRemoteDiscoveryModeResponse(SetRemoteDiscoveryModeResponse2 value) {
        return new JAXBElement<SetRemoteDiscoveryModeResponse2>(_SetRemoteDiscoveryModeResponse_QNAME, SetRemoteDiscoveryModeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIPAddressFilter2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "removeIPAddressFilter")
    public JAXBElement<RemoveIPAddressFilter2> createRemoveIPAddressFilter(RemoveIPAddressFilter2 value) {
        return new JAXBElement<RemoveIPAddressFilter2>(_RemoveIPAddressFilter_QNAME, RemoveIPAddressFilter2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPolicyResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setAccessPolicyResponse")
    public JAXBElement<SetAccessPolicyResponse2> createSetAccessPolicyResponse(SetAccessPolicyResponse2 value) {
        return new JAXBElement<SetAccessPolicyResponse2>(_SetAccessPolicyResponse_QNAME, SetAccessPolicyResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetScopes2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setScopes")
    public JAXBElement<SetScopes2> createSetScopes(SetScopes2 value) {
        return new JAXBElement<SetScopes2>(_SetScopes_QNAME, SetScopes2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeSystemFirmwareResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "upgradeSystemFirmwareResponse")
    public JAXBElement<UpgradeSystemFirmwareResponse2> createUpgradeSystemFirmwareResponse(UpgradeSystemFirmwareResponse2 value) {
        return new JAXBElement<UpgradeSystemFirmwareResponse2>(_UpgradeSystemFirmwareResponse_QNAME, UpgradeSystemFirmwareResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanAvailableDot11Networks2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "scanAvailableDot11Networks")
    public JAXBElement<ScanAvailableDot11Networks2> createScanAvailableDot11Networks(ScanAvailableDot11Networks2 value) {
        return new JAXBElement<ScanAvailableDot11Networks2>(_ScanAvailableDot11Networks_QNAME, ScanAvailableDot11Networks2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDot1XConfigurationsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDot1XConfigurationsResponse")
    public JAXBElement<GetDot1XConfigurationsResponse2> createGetDot1XConfigurationsResponse(GetDot1XConfigurationsResponse2 value) {
        return new JAXBElement<GetDot1XConfigurationsResponse2>(_GetDot1XConfigurationsResponse_QNAME, GetDot1XConfigurationsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialect")
    public JAXBElement<String> createTopicExpressionDialect(String value) {
        return new JAXBElement<String>(_TopicExpressionDialect_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnrecognizedPolicyRequestFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnrecognizedPolicyRequestFault")
    public JAXBElement<UnrecognizedPolicyRequestFaultType> createUnrecognizedPolicyRequestFault(UnrecognizedPolicyRequestFaultType value) {
        return new JAXBElement<UnrecognizedPolicyRequestFaultType>(_UnrecognizedPolicyRequestFault_QNAME, UnrecognizedPolicyRequestFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSourceConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoSourceConfiguration")
    public JAXBElement<VideoSourceConfiguration> createVideoSourceConfiguration(VideoSourceConfiguration value) {
        return new JAXBElement<VideoSourceConfiguration>(_VideoSourceConfiguration_QNAME, VideoSourceConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIPAddressFilter2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getIPAddressFilter")
    public JAXBElement<GetIPAddressFilter2> createGetIPAddressFilter(GetIPAddressFilter2 value) {
        return new JAXBElement<GetIPAddressFilter2>(_GetIPAddressFilter_QNAME, GetIPAddressFilter2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCACertificates2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCACertificates")
    public JAXBElement<GetCACertificates2> createGetCACertificates(GetCACertificates2 value) {
        return new JAXBElement<GetCACertificates2>(_GetCACertificates_QNAME, GetCACertificates2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceInformation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDeviceInformation")
    public JAXBElement<GetDeviceInformation2> createGetDeviceInformation(GetDeviceInformation2 value) {
        return new JAXBElement<GetDeviceInformation2>(_GetDeviceInformation_QNAME, GetDeviceInformation2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationMessageHolderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotificationMessage")
    public JAXBElement<NotificationMessageHolderType> createNotificationMessage(NotificationMessageHolderType value) {
        return new JAXBElement<NotificationMessageHolderType>(_NotificationMessage_QNAME, NotificationMessageHolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionPolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionPolicy")
    public JAXBElement<SubscriptionPolicyType> createSubscriptionPolicy(SubscriptionPolicyType value) {
        return new JAXBElement<SubscriptionPolicyType>(_SubscriptionPolicy_QNAME, SubscriptionPolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse2> createGetUsersResponse(GetUsersResponse2 value) {
        return new JAXBElement<GetUsersResponse2>(_GetUsersResponse_QNAME, GetUsersResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPkcs10RequestResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getPkcs10RequestResponse")
    public JAXBElement<GetPkcs10RequestResponse2> createGetPkcs10RequestResponse(GetPkcs10RequestResponse2 value) {
        return new JAXBElement<GetPkcs10RequestResponse2>(_GetPkcs10RequestResponse_QNAME, GetPkcs10RequestResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemLogResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemLogResponse")
    public JAXBElement<GetSystemLogResponse2> createGetSystemLogResponse(GetSystemLogResponse2 value) {
        return new JAXBElement<GetSystemLogResponse2>(_GetSystemLogResponse_QNAME, GetSystemLogResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Topic")
    public JAXBElement<TopicExpressionType> createTopic(TopicExpressionType value) {
        return new JAXBElement<TopicExpressionType>(_Topic_QNAME, TopicExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDynamicDNSResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDynamicDNSResponse")
    public JAXBElement<GetDynamicDNSResponse2> createGetDynamicDNSResponse(GetDynamicDNSResponse2 value) {
        return new JAXBElement<GetDynamicDNSResponse2>(_GetDynamicDNSResponse_QNAME, GetDynamicDNSResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCertificatesStatus2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setCertificatesStatus")
    public JAXBElement<SetCertificatesStatus2> createSetCertificatesStatus(SetCertificatesStatus2 value) {
        return new JAXBElement<SetCertificatesStatus2>(_SetCertificatesStatus_QNAME, SetCertificatesStatus2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeFailedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ResumeFailedFault")
    public JAXBElement<ResumeFailedFaultType> createResumeFailedFault(ResumeFailedFaultType value) {
        return new JAXBElement<ResumeFailedFaultType>(_ResumeFailedFault_QNAME, ResumeFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServices2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getServices")
    public JAXBElement<GetServices2> createGetServices(GetServices2 value) {
        return new JAXBElement<GetServices2>(_GetServices_QNAME, GetServices2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelayOutputs2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getRelayOutputs")
    public JAXBElement<GetRelayOutputs2> createGetRelayOutputs(GetRelayOutputs2 value) {
        return new JAXBElement<GetRelayOutputs2>(_GetRelayOutputs_QNAME, GetRelayOutputs2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartFirmwareUpgrade2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "startFirmwareUpgrade")
    public JAXBElement<StartFirmwareUpgrade2> createStartFirmwareUpgrade(StartFirmwareUpgrade2 value) {
        return new JAXBElement<StartFirmwareUpgrade2>(_StartFirmwareUpgrade_QNAME, StartFirmwareUpgrade2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientCertificateMode2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setClientCertificateMode")
    public JAXBElement<SetClientCertificateMode2> createSetClientCertificateMode(SetClientCertificateMode2 value) {
        return new JAXBElement<SetClientCertificateMode2>(_SetClientCertificateMode_QNAME, SetClientCertificateMode2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNetworkDefaultGatewayResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "setNetworkDefaultGatewayResponse")
    public JAXBElement<SetNetworkDefaultGatewayResponse2> createSetNetworkDefaultGatewayResponse(SetNetworkDefaultGatewayResponse2 value) {
        return new JAXBElement<SetNetworkDefaultGatewayResponse2>(_SetNetworkDefaultGatewayResponse_QNAME, SetNetworkDefaultGatewayResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemUris2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getSystemUris")
    public JAXBElement<GetSystemUris2> createGetSystemUris(GetSystemUris2 value) {
        return new JAXBElement<GetSystemUris2>(_GetSystemUris_QNAME, GetSystemUris2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscoveryModeResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getDiscoveryModeResponse")
    public JAXBElement<GetDiscoveryModeResponse2> createGetDiscoveryModeResponse(GetDiscoveryModeResponse2 value) {
        return new JAXBElement<GetDiscoveryModeResponse2>(_GetDiscoveryModeResponse_QNAME, GetDiscoveryModeResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetworkDefaultGateway2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getNetworkDefaultGateway")
    public JAXBElement<GetNetworkDefaultGateway2> createGetNetworkDefaultGateway(GetNetworkDefaultGateway2 value) {
        return new JAXBElement<GetNetworkDefaultGateway2>(_GetNetworkDefaultGateway_QNAME, GetNetworkDefaultGateway2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificatesStatusResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "getCertificatesStatusResponse")
    public JAXBElement<GetCertificatesStatusResponse2> createGetCertificatesStatusResponse(GetCertificatesStatusResponse2 value) {
        return new JAXBElement<GetCertificatesStatusResponse2>(_GetCertificatesStatusResponse_QNAME, GetCertificatesStatusResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIPAddressFilter2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bee/", name = "addIPAddressFilter")
    public JAXBElement<AddIPAddressFilter2> createAddIPAddressFilter(AddIPAddressFilter2 value) {
        return new JAXBElement<AddIPAddressFilter2>(_AddIPAddressFilter_QNAME, AddIPAddressFilter2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTZConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "PTZConfiguration")
    public JAXBElement<PTZConfiguration> createPTZConfiguration(PTZConfiguration value) {
        return new JAXBElement<PTZConfiguration>(_PTZConfiguration_QNAME, PTZConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioEncoderConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioEncoderConfiguration")
    public JAXBElement<AudioEncoderConfiguration> createAudioEncoderConfiguration(AudioEncoderConfiguration value) {
        return new JAXBElement<AudioEncoderConfiguration>(_AudioEncoderConfiguration_QNAME, AudioEncoderConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TerminationTime", scope = SubscribeResponse.class)
    public JAXBElement<XMLGregorianCalendar> createSubscribeResponseTerminationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminationTime_QNAME, XMLGregorianCalendar.class, SubscribeResponse.class, value);
    }

}
