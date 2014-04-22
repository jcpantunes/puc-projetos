/**
 * Mage_Api_Model_Server_Wsi_HandlerBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package magento;

public class Mage_Api_Model_Server_Wsi_HandlerBindingStub extends org.apache.axis.client.Stub implements magento.Mage_Api_Model_Server_Wsi_HandlerPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[137];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("call");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "callParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">callParam"), magento.CallParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">callResponseParam"));
        oper.setReturnClass(magento.CallResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "callResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("multiCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "multiCallParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">multiCallParam"), magento.MultiCallParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">multiCallResponseParam"));
        oper.setReturnClass(magento.MultiCallResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "multiCallResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("endSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "endSessionParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">endSessionParam"), magento.EndSessionParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">endSessionResponseParam"));
        oper.setReturnClass(magento.EndSessionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "endSessionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "loginParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">loginParam"), magento.LoginParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">loginResponseParam"));
        oper.setReturnClass(magento.LoginResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "loginResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startSession");
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">startSessionResponseParam"));
        oper.setReturnClass(magento.StartSessionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "startSessionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "resourcesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">resourcesRequestParam"), magento.ResourcesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">resourcesResponseParam"));
        oper.setReturnClass(magento.ResourcesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "resourcesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("globalFaults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "globalFaultsParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">globalFaultsParam"), magento.GlobalFaultsParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">globalFaultsResponseParam"));
        oper.setReturnClass(magento.GlobalFaultsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "globalFaultsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resourceFaults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "resourceFaultsParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsParam"), magento.ResourceFaultsParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsResponseParam"));
        oper.setReturnClass(magento.ResourceFaultsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "resourceFaultsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "storeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">storeListRequestParam"), magento.StoreListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">storeListResponseParam"));
        oper.setReturnClass(magento.StoreListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "storeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "storeInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">storeInfoRequestParam"), magento.StoreInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">storeInfoResponseParam"));
        oper.setReturnClass(magento.StoreInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "storeInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryCountryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "directoryCountryListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListRequestParam"), magento.DirectoryCountryListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListResponseParam"));
        oper.setReturnClass(magento.DirectoryCountryListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "directoryCountryListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryRegionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "directoryRegionListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListRequestParam"), magento.DirectoryRegionListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListResponseParam"));
        oper.setReturnClass(magento.DirectoryRegionListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "directoryRegionListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListRequestParam"), magento.CustomerCustomerListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListResponseParam"));
        oper.setReturnClass(magento.CustomerCustomerListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateRequestParam"), magento.CustomerCustomerCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateResponseParam"));
        oper.setReturnClass(magento.CustomerCustomerCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoRequestParam"), magento.CustomerCustomerInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoResponseParam"));
        oper.setReturnClass(magento.CustomerCustomerInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateRequestParam"), magento.CustomerCustomerUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateResponseParam"));
        oper.setReturnClass(magento.CustomerCustomerUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteRequestParam"), magento.CustomerCustomerDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteResponseParam"));
        oper.setReturnClass(magento.CustomerCustomerDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerGroupList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerGroupListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerGroupListRequestParam"), magento.CustomerGroupListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerGroupListResponseParam"));
        oper.setReturnClass(magento.CustomerGroupListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerGroupListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressListRequestParam"), magento.CustomerAddressListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressListResponseParam"));
        oper.setReturnClass(magento.CustomerAddressListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateRequestParam"), magento.CustomerAddressCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateResponseParam"));
        oper.setReturnClass(magento.CustomerAddressCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoRequestParam"), magento.CustomerAddressInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoResponseParam"));
        oper.setReturnClass(magento.CustomerAddressInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateRequestParam"), magento.CustomerAddressUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateResponseParam"));
        oper.setReturnClass(magento.CustomerAddressUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteRequestParam"), magento.CustomerAddressDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteResponseParam"));
        oper.setReturnClass(magento.CustomerAddressDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreRequestParam"), magento.CatalogCategoryCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryTree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryTreeRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeRequestParam"), magento.CatalogCategoryTreeRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryTreeResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryTreeResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryLevelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelRequestParam"), magento.CatalogCategoryLevelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryLevelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryLevelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoRequestParam"), magento.CatalogCategoryInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateRequestParam"), magento.CatalogCategoryCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateRequestParam"), magento.CatalogCategoryUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryMove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryMoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveRequestParam"), magento.CatalogCategoryMoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryMoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryMoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteRequestParam"), magento.CatalogCategoryDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAssignedProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignedProductsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsRequestParam"), magento.CatalogCategoryAssignedProductsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryAssignedProductsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignedProductsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAssignProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductRequestParam"), magento.CatalogCategoryAssignProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryAssignProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryUpdateProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductRequestParam"), magento.CatalogCategoryUpdateProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryUpdateProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryRemoveProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryRemoveProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductRequestParam"), magento.CatalogCategoryRemoveProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryRemoveProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryRemoveProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreRequestParam"), magento.CatalogProductCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreResponseParam"));
        oper.setReturnClass(magento.CatalogProductCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductListRequestParam"), magento.CatalogProductListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductListResponseParam"));
        oper.setReturnClass(magento.CatalogProductListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoRequestParam"), magento.CatalogProductInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoResponseParam"));
        oper.setReturnClass(magento.CatalogProductInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateRequestParam"), magento.CatalogProductCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateResponseParam"));
        oper.setReturnClass(magento.CatalogProductCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateRequestParam"), magento.CatalogProductUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogProductUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductSetSpecialPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductSetSpecialPriceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceRequestParam"), magento.CatalogProductSetSpecialPriceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceResponseParam"));
        oper.setReturnClass(magento.CatalogProductSetSpecialPriceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductSetSpecialPriceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductGetSpecialPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductGetSpecialPriceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceRequestParam"), magento.CatalogProductGetSpecialPriceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceResponseParam"));
        oper.setReturnClass(magento.CatalogProductGetSpecialPriceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductGetSpecialPriceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteRequestParam"), magento.CatalogProductDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteResponseParam"));
        oper.setReturnClass(magento.CatalogProductDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreRequestParam"), magento.CatalogProductAttributeCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListRequestParam"), magento.CatalogProductAttributeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsRequestParam"), magento.CatalogProductAttributeOptionsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeOptionsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListRequestParam"), magento.CatalogProductAttributeSetListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeSetListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTypeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListRequestParam"), magento.CatalogProductTypeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListResponseParam"));
        oper.setReturnClass(magento.CatalogProductTypeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeTierPriceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoRequestParam"), magento.CatalogProductAttributeTierPriceInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeTierPriceInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeTierPriceUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateRequestParam"), magento.CatalogProductAttributeTierPriceUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeTierPriceUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreRequestParam"), magento.CatalogCategoryAttributeCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryAttributeCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListRequestParam"), magento.CatalogCategoryAttributeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryAttributeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeOptionsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsRequestParam"), magento.CatalogCategoryAttributeOptionsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsResponseParam"));
        oper.setReturnClass(magento.CatalogCategoryAttributeOptionsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeOptionsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreRequestParam"), magento.CatalogProductAttributeMediaCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeMediaCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListRequestParam"), magento.CatalogProductAttributeMediaListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeMediaListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoRequestParam"), magento.CatalogProductAttributeMediaInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeMediaInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesRequestParam"), magento.CatalogProductAttributeMediaTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeMediaTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateRequestParam"), magento.CatalogProductAttributeMediaCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeMediaCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateRequestParam"), magento.CatalogProductAttributeMediaUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeMediaUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveRequestParam"), magento.CatalogProductAttributeMediaRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveResponseParam"));
        oper.setReturnClass(magento.CatalogProductAttributeMediaRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListRequestParam"), magento.CatalogProductLinkListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListResponseParam"));
        oper.setReturnClass(magento.CatalogProductLinkListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkAssign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAssignRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignRequestParam"), magento.CatalogProductLinkAssignRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignResponseParam"));
        oper.setReturnClass(magento.CatalogProductLinkAssignResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAssignResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateRequestParam"), magento.CatalogProductLinkUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogProductLinkUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveRequestParam"), magento.CatalogProductLinkRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveResponseParam"));
        oper.setReturnClass(magento.CatalogProductLinkRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesRequestParam"), magento.CatalogProductLinkTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesResponseParam"));
        oper.setReturnClass(magento.CatalogProductLinkTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesRequestParam"), magento.CatalogProductLinkAttributesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesResponseParam"));
        oper.setReturnClass(magento.CatalogProductLinkAttributesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderListRequestParam"), magento.SalesOrderListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderListResponseParam"));
        oper.setReturnClass(magento.SalesOrderListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoRequestParam"), magento.SalesOrderInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoResponseParam"));
        oper.setReturnClass(magento.SalesOrderInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentRequestParam"), magento.SalesOrderAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentResponseParam"));
        oper.setReturnClass(magento.SalesOrderAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderHold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderHoldRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldRequestParam"), magento.SalesOrderHoldRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldResponseParam"));
        oper.setReturnClass(magento.SalesOrderHoldResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderHoldResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderUnhold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderUnholdRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdRequestParam"), magento.SalesOrderUnholdRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdResponseParam"));
        oper.setReturnClass(magento.SalesOrderUnholdResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderUnholdResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelRequestParam"), magento.SalesOrderCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelResponseParam"));
        oper.setReturnClass(magento.SalesOrderCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListRequestParam"), magento.SalesOrderShipmentListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoRequestParam"), magento.SalesOrderShipmentInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateRequestParam"), magento.SalesOrderShipmentCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentRequestParam"), magento.SalesOrderShipmentAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentAddTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddTrackRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackRequestParam"), magento.SalesOrderShipmentAddTrackRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentAddTrackResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddTrackResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentRemoveTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentRemoveTrackRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackRequestParam"), magento.SalesOrderShipmentRemoveTrackRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentRemoveTrackResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentRemoveTrackResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentSendInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentSendInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoRequestParam"), magento.SalesOrderShipmentSendInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentSendInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentSendInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentGetCarriers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentGetCarriersRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersRequestParam"), magento.SalesOrderShipmentGetCarriersRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersResponseParam"));
        oper.setReturnClass(magento.SalesOrderShipmentGetCarriersResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentGetCarriersResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListRequestParam"), magento.SalesOrderInvoiceListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListResponseParam"));
        oper.setReturnClass(magento.SalesOrderInvoiceListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoRequestParam"), magento.SalesOrderInvoiceInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoResponseParam"));
        oper.setReturnClass(magento.SalesOrderInvoiceInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateRequestParam"), magento.SalesOrderInvoiceCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateResponseParam"));
        oper.setReturnClass(magento.SalesOrderInvoiceCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentRequestParam"), magento.SalesOrderInvoiceAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentResponseParam"));
        oper.setReturnClass(magento.SalesOrderInvoiceAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCapture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCaptureRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureRequestParam"), magento.SalesOrderInvoiceCaptureRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureResponseParam"));
        oper.setReturnClass(magento.SalesOrderInvoiceCaptureResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCaptureResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceVoid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceVoidRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidRequestParam"), magento.SalesOrderInvoiceVoidRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidResponseParam"));
        oper.setReturnClass(magento.SalesOrderInvoiceVoidResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceVoidResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelRequestParam"), magento.SalesOrderInvoiceCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelResponseParam"));
        oper.setReturnClass(magento.SalesOrderInvoiceCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListRequestParam"), magento.SalesOrderCreditmemoListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListResponseParam"));
        oper.setReturnClass(magento.SalesOrderCreditmemoListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoRequestParam"), magento.SalesOrderCreditmemoInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoResponseParam"));
        oper.setReturnClass(magento.SalesOrderCreditmemoInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateRequestParam"), magento.SalesOrderCreditmemoCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateResponseParam"));
        oper.setReturnClass(magento.SalesOrderCreditmemoCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentRequestParam"), magento.SalesOrderCreditmemoAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentResponseParam"));
        oper.setReturnClass(magento.SalesOrderCreditmemoAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelRequestParam"), magento.SalesOrderCreditmemoCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelResponseParam"));
        oper.setReturnClass(magento.SalesOrderCreditmemoCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListRequestParam"), magento.CatalogInventoryStockItemListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListResponseParam"));
        oper.setReturnClass(magento.CatalogInventoryStockItemListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateRequestParam"), magento.CatalogInventoryStockItemUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogInventoryStockItemUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateRequestParam"), magento.ShoppingCartCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateResponseParam"));
        oper.setReturnClass(magento.ShoppingCartCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoRequestParam"), magento.ShoppingCartInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoResponseParam"));
        oper.setReturnClass(magento.ShoppingCartInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartTotals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsRequestParam"), magento.ShoppingCartTotalsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsResponseParam"));
        oper.setReturnClass(magento.ShoppingCartTotalsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartOrderRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderRequestParam"), magento.ShoppingCartOrderRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderResponseParam"));
        oper.setReturnClass(magento.ShoppingCartOrderResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartOrderResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartLicense");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseRequestParam"), magento.ShoppingCartLicenseRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseResponseParam"));
        oper.setReturnClass(magento.ShoppingCartLicenseResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddRequestParam"), magento.ShoppingCartProductAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddResponseParam"));
        oper.setReturnClass(magento.ShoppingCartProductAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateRequestParam"), magento.ShoppingCartProductUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateResponseParam"));
        oper.setReturnClass(magento.ShoppingCartProductUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveRequestParam"), magento.ShoppingCartProductRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveResponseParam"));
        oper.setReturnClass(magento.ShoppingCartProductRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListRequestParam"), magento.ShoppingCartProductListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListResponseParam"));
        oper.setReturnClass(magento.ShoppingCartProductListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductMoveToCustomerQuote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductMoveToCustomerQuoteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteRequestParam"), magento.ShoppingCartProductMoveToCustomerQuoteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteResponseParam"));
        oper.setReturnClass(magento.ShoppingCartProductMoveToCustomerQuoteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductMoveToCustomerQuoteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerSetRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetRequestParam"), magento.ShoppingCartCustomerSetRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetResponseParam"));
        oper.setReturnClass(magento.ShoppingCartCustomerSetResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerSetResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesRequestParam"), magento.ShoppingCartCustomerAddressesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesResponseParam"));
        oper.setReturnClass(magento.ShoppingCartCustomerAddressesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartShippingMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodRequestParam"), magento.ShoppingCartShippingMethodRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodResponseParam"));
        oper.setReturnClass(magento.ShoppingCartShippingMethodResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartShippingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListRequestParam"), magento.ShoppingCartShippingListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListResponseParam"));
        oper.setReturnClass(magento.ShoppingCartShippingListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartPaymentMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodRequestParam"), magento.ShoppingCartPaymentMethodRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodResponseParam"));
        oper.setReturnClass(magento.ShoppingCartPaymentMethodResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartPaymentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListRequestParam"), magento.ShoppingCartPaymentListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListResponseParam"));
        oper.setReturnClass(magento.ShoppingCartPaymentListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCouponAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddRequestParam"), magento.ShoppingCartCouponAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddResponseParam"));
        oper.setReturnClass(magento.ShoppingCartCouponAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCouponRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveRequestParam"), magento.ShoppingCartCouponRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveResponseParam"));
        oper.setReturnClass(magento.ShoppingCartCouponRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListRequestParam"), magento.CatalogProductTagListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListResponseParam"));
        oper.setReturnClass(magento.CatalogProductTagListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoRequestParam"), magento.CatalogProductTagInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoResponseParam"));
        oper.setReturnClass(magento.CatalogProductTagInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddRequestParam"), magento.CatalogProductTagAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddResponseParam"));
        oper.setReturnClass(magento.CatalogProductTagAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateRequestParam"), magento.CatalogProductTagUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogProductTagUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveRequestParam"), magento.CatalogProductTagRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveResponseParam"));
        oper.setReturnClass(magento.CatalogProductTagRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteRequestParam"), magento.GiftMessageForQuoteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteResponseParam"));
        oper.setReturnClass(magento.GiftMessageForQuoteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuoteItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteItemRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemRequestParam"), magento.GiftMessageForQuoteItemRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemResponseParam"));
        oper.setReturnClass(magento.GiftMessageForQuoteItemResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteItemResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuoteProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductRequestParam"), magento.GiftMessageForQuoteProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductResponseParam"));
        oper.setReturnClass(magento.GiftMessageForQuoteProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enterpriseCustomerbalanceBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "enterpriseCustomerbalanceBalanceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceBalanceRequestParam"), magento.EnterpriseCustomerbalanceBalanceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceBalanceResponseParam"));
        oper.setReturnClass(magento.EnterpriseCustomerbalanceBalanceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "enterpriseCustomerbalanceBalanceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enterpriseCustomerbalanceHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "enterpriseCustomerbalanceHistoryRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceHistoryRequestParam"), magento.EnterpriseCustomerbalanceHistoryRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceHistoryResponseParam"));
        oper.setReturnClass(magento.EnterpriseCustomerbalanceHistoryResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "enterpriseCustomerbalanceHistoryResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerbalanceSetAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerbalanceSetAmountRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceSetAmountRequestParam"), magento.ShoppingCartCustomerbalanceSetAmountRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceSetAmountResponseParam"));
        oper.setReturnClass(magento.ShoppingCartCustomerbalanceSetAmountResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerbalanceSetAmountResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerbalanceRemoveAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerbalanceRemoveAmountRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceRemoveAmountRequestParam"), magento.ShoppingCartCustomerbalanceRemoveAmountRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceRemoveAmountResponseParam"));
        oper.setReturnClass(magento.ShoppingCartCustomerbalanceRemoveAmountResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerbalanceRemoveAmountResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftcardAccountCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountCreateRequestParam"), magento.GiftcardAccountCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountCreateResponseParam"));
        oper.setReturnClass(magento.GiftcardAccountCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftcardAccountUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountUpdateRequestParam"), magento.GiftcardAccountUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountUpdateResponseParam"));
        oper.setReturnClass(magento.GiftcardAccountUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftcardAccountRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountRemoveRequestParam"), magento.GiftcardAccountRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountRemoveResponseParam"));
        oper.setReturnClass(magento.GiftcardAccountRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftcardAccountList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountListRequestParam"), magento.GiftcardAccountListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountListResponseParam"));
        oper.setReturnClass(magento.GiftcardAccountListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftcardAccountInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountInfoRequestParam"), magento.GiftcardAccountInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountInfoResponseParam"));
        oper.setReturnClass(magento.GiftcardAccountInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftcardAccountInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftcardCustomerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftcardCustomerInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerInfoRequestParam"), magento.GiftcardCustomerInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerInfoResponseParam"));
        oper.setReturnClass(magento.GiftcardCustomerInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftcardCustomerInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftcardCustomerRedeem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftcardCustomerRedeemRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerRedeemRequestParam"), magento.GiftcardCustomerRedeemRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerRedeemResponseParam"));
        oper.setReturnClass(magento.GiftcardCustomerRedeemResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftcardCustomerRedeemResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartGiftcardAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartGiftcardAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardAddRequestParam"), magento.ShoppingCartGiftcardAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardAddResponseParam"));
        oper.setReturnClass(magento.ShoppingCartGiftcardAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartGiftcardAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartGiftcardRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartGiftcardRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardRemoveRequestParam"), magento.ShoppingCartGiftcardRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardRemoveResponseParam"));
        oper.setReturnClass(magento.ShoppingCartGiftcardRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartGiftcardRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartGiftcardList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartGiftcardListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardListRequestParam"), magento.ShoppingCartGiftcardListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardListResponseParam"));
        oper.setReturnClass(magento.ShoppingCartGiftcardListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartGiftcardListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductMultiUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductMultiUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateRequestParam"), magento.CatalogProductMultiUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogProductMultiUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductMultiUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saasRefreshCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "saasRefreshCatalogRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">saasRefreshCatalogRequestParam"), magento.SaasRefreshCatalogRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">saasRefreshCatalogResponseParam"));
        oper.setReturnClass(magento.SaasRefreshCatalogResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "saasRefreshCatalogResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemMultiUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemMultiUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateRequestParam"), magento.CatalogInventoryStockItemMultiUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateResponseParam"));
        oper.setReturnClass(magento.CatalogInventoryStockItemMultiUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemMultiUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

    }

    public Mage_Api_Model_Server_Wsi_HandlerBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Mage_Api_Model_Server_Wsi_HandlerBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Mage_Api_Model_Server_Wsi_HandlerBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", ">callParam");
            cachedSerQNames.add(qName);
            cls = magento.CallParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">callResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CallResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAssignedProductsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAssignedProductsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAssignProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAssignProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAttributeCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAttributeCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAttributeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAttributeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAttributeOptionsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryAttributeOptionsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryLevelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryLevelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryMoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryMoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryRemoveProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryRemoveProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryTreeRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryTreeResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryUpdateProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryUpdateProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemMultiUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemMultiUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeOptionsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeOptionsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeSetListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeSetListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeTierPriceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeTierPriceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeTierPriceUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeTierPriceUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductGetSpecialPriceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductGetSpecialPriceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkAssignRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkAssignResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkAttributesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkAttributesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductMultiUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductMultiUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductSetSpecialPriceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductSetSpecialPriceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTypeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTypeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerGroupListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerGroupListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerGroupListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.CustomerGroupListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryCountryListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryCountryListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryRegionListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryRegionListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">endSessionParam");
            cachedSerQNames.add(qName);
            cls = magento.EndSessionParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">endSessionResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.EndSessionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceBalanceRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseCustomerbalanceBalanceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceBalanceResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseCustomerbalanceBalanceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceHistoryRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseCustomerbalanceHistoryRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">enterpriseCustomerbalanceHistoryResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseCustomerbalanceHistoryResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardAccountUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardCustomerInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardCustomerInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerRedeemRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardCustomerRedeemRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftcardCustomerRedeemResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardCustomerRedeemResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageForQuoteItemRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageForQuoteItemResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageForQuoteProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageForQuoteProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageForQuoteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageForQuoteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">globalFaultsParam");
            cachedSerQNames.add(qName);
            cls = magento.GlobalFaultsParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">globalFaultsResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.GlobalFaultsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">loginParam");
            cachedSerQNames.add(qName);
            cls = magento.LoginParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">loginResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.LoginResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">multiCallParam");
            cachedSerQNames.add(qName);
            cls = magento.MultiCallParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">multiCallResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.MultiCallResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsParam");
            cachedSerQNames.add(qName);
            cls = magento.ResourceFaultsParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ResourceFaultsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourcesRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ResourcesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourcesResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ResourcesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">saasRefreshCatalogRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SaasRefreshCatalogRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">saasRefreshCatalogResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SaasRefreshCatalogResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderHoldRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderHoldResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCaptureRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCaptureResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceVoidRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceVoidResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentAddTrackRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentAddTrackResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentGetCarriersRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentGetCarriersResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentRemoveTrackRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentRemoveTrackResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentSendInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentSendInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderUnholdRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderUnholdResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCouponAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCouponAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCouponRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCouponRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerAddressesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerAddressesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceRemoveAmountRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerbalanceRemoveAmountRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceRemoveAmountResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerbalanceRemoveAmountResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceSetAmountRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerbalanceSetAmountRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerbalanceSetAmountResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerbalanceSetAmountResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerSetRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerSetResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardAddRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartGiftcardAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardAddResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartGiftcardAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartGiftcardListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartGiftcardListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartGiftcardRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartGiftcardRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartGiftcardRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartLicenseRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartLicenseResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartOrderRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartOrderResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartPaymentListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartPaymentListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartPaymentMethodRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartPaymentMethodResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductMoveToCustomerQuoteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductMoveToCustomerQuoteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartShippingListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartShippingListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartShippingMethodRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartShippingMethodResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartTotalsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartTotalsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">startSessionResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.StartSessionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.StoreInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.StoreInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeListRequestParam");
            cachedSerQNames.add(qName);
            cls = magento.StoreListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeListResponseParam");
            cachedSerQNames.add(qName);
            cls = magento.StoreListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "apiEntity");
            cachedSerQNames.add(qName);
            cls = magento.ApiEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "apiMethodEntity");
            cachedSerQNames.add(qName);
            cls = magento.ApiMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfApiMethods");
            cachedSerQNames.add(qName);
            cls = magento.ApiMethodEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "apiMethodEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfApis");
            cachedSerQNames.add(qName);
            cls = magento.ApiEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "apiEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfCatalogCategoryEntities");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfCatalogCategoryEntitiesNoChildren");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryEntityNoChildren[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntityNoChildren");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfExistsFaltures");
            cachedSerQNames.add(qName);
            cls = magento.ExistsFaltureEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "existsFaltureEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeArray");
            cachedSerQNames.add(qName);
            cls = magento.AssociativeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "associativeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeEntity");
            cachedSerQNames.add(qName);
            cls = magento.AssociativeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeMultiArray");
            cachedSerQNames.add(qName);
            cls = magento.AssociativeMultiEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "associativeMultiEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeMultiEntity");
            cachedSerQNames.add(qName);
            cls = magento.AssociativeMultiEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAssignedProduct");
            cachedSerQNames.add(qName);
            cls = magento.CatalogAssignedProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAssignedProductArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogAssignedProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAssignedProduct");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogAttributeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeOptionEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogAttributeOptionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeOptionEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogAttributeOptionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeOptionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntityCreate");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryEntityCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntityNoChildren");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryEntityNoChildren.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryInfo");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryTree");
            cachedSerQNames.add(qName);
            cls = magento.CatalogCategoryTree.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogInventoryStockItemUpdateEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCreateEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaCreateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypeEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaTypeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypeEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeMediaTypeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeSetEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductAttributeSetEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductCreateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductCreateEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductImageEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductImageEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageFileEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductImageFileEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributeEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributeEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkAttributeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductLinkEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductRequestAttributes");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductRequestAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductReturnEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductReturnEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagAddEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagAddEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagInfoEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagUpdateEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTagUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTierPriceEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTierPriceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTierPriceEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTierPriceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTierPriceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeEntity");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTypeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductTypeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "complexFilter");
            cachedSerQNames.add(qName);
            cls = magento.ComplexFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "complexFilterArray");
            cachedSerQNames.add(qName);
            cls = magento.ComplexFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "complexFilter");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressEntityItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityItem");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityCreate");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressEntityCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityItem");
            cachedSerQNames.add(qName);
            cls = magento.CustomerAddressEntityItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntity");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntityToCreate");
            cachedSerQNames.add(qName);
            cls = magento.CustomerCustomerEntityToCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerGroupEntity");
            cachedSerQNames.add(qName);
            cls = magento.CustomerGroupEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerGroupEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CustomerGroupEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "customerGroupEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryCountryEntity");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryCountryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryCountryEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryCountryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "directoryCountryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryRegionEntity");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryRegionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryRegionEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.DirectoryRegionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "directoryRegionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "enterpriseCustomerbalanceHistoryItemEntity");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseCustomerbalanceHistoryItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "enterpriseCustomerbalanceHistoryItemEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseCustomerbalanceHistoryItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "enterpriseCustomerbalanceHistoryItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "enterpriseGiftcardaccountListEntity");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseGiftcardaccountListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "enterpriseGiftcardaccountListEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.EnterpriseGiftcardaccountListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "enterpriseGiftcardaccountListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "existsFaltureEntity");
            cachedSerQNames.add(qName);
            cls = magento.ExistsFaltureEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "filters");
            cachedSerQNames.add(qName);
            cls = magento.Filters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountCreateGiftcardAccountData");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountCreateGiftcardAccountData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountCreateNotificationData");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountCreateNotificationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountEntity");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountEntityHistory");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountEntityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountEntityHistoryArray");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountEntityHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountEntityHistory");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardAccountEntityToUpdate");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardAccountEntityToUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftcardCustomerEntity");
            cachedSerQNames.add(qName);
            cls = magento.GiftcardCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageAssociativeProductsEntity");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageAssociativeProductsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageAssociativeProductsEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageAssociativeProductsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageAssociativeProductsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageEntity");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageResponse");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageResponseArray");
            cachedSerQNames.add(qName);
            cls = magento.GiftMessageResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageResponse");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "orderItemIdQty");
            cachedSerQNames.add(qName);
            cls = magento.OrderItemIdQty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "orderItemIdQtyArray");
            cachedSerQNames.add(qName);
            cls = magento.OrderItemIdQty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "orderItemIdQty");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderAddressEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCommentEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoData");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoItemEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoItemEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderCreditmemoItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCommentEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceItemEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceItemEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderInvoiceItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderItemEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderItemEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderListEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderListEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderPaymentEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderPaymentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCommentEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentItemEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentItemEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentTrackEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentTrackEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentTrackEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderShipmentTrackEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentTrackEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderStatusHistoryEntity");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderStatusHistoryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderStatusHistoryEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.SalesOrderStatusHistoryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderStatusHistoryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartAddressEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerAddressEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartInfoEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartItemEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartItemEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartLicenseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartLicenseEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartPaymentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartPaymentMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodResponseEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartPaymentMethodResponseEntityArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductResponseEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.CatalogProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartShippingMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartShippingMethodEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsEntity");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartTotalsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.ShoppingCartTotalsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "storeEntity");
            cachedSerQNames.add(qName);
            cls = magento.StoreEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "storeEntityArray");
            cachedSerQNames.add(qName);
            cls = magento.StoreEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "storeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public magento.CallResponseParam call(magento.CallParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "call"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CallResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CallResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CallResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.MultiCallResponseParam multiCall(magento.MultiCallParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "multiCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.MultiCallResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.MultiCallResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.MultiCallResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.EndSessionResponseParam endSession(magento.EndSessionParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "endSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.EndSessionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.EndSessionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.EndSessionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.LoginResponseParam login(magento.LoginParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.LoginResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.LoginResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.LoginResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.StartSessionResponseParam startSession() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.StartSessionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.StartSessionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.StartSessionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ResourcesResponseParam resources(magento.ResourcesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ResourcesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ResourcesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ResourcesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GlobalFaultsResponseParam globalFaults(magento.GlobalFaultsParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "globalFaults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GlobalFaultsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GlobalFaultsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GlobalFaultsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ResourceFaultsResponseParam resourceFaults(magento.ResourceFaultsParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resourceFaults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ResourceFaultsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ResourceFaultsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ResourceFaultsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.StoreListResponseParam storeList(magento.StoreListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "storeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.StoreListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.StoreListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.StoreListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.StoreInfoResponseParam storeInfo(magento.StoreInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "storeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.StoreInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.StoreInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.StoreInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.DirectoryCountryListResponseParam directoryCountryList(magento.DirectoryCountryListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryCountryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.DirectoryCountryListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.DirectoryCountryListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.DirectoryCountryListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.DirectoryRegionListResponseParam directoryRegionList(magento.DirectoryRegionListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryRegionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.DirectoryRegionListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.DirectoryRegionListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.DirectoryRegionListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerCustomerListResponseParam customerCustomerList(magento.CustomerCustomerListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerCustomerListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerCustomerListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerCustomerListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerCustomerCreateResponseParam customerCustomerCreate(magento.CustomerCustomerCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerCustomerCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerCustomerCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerCustomerCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerCustomerInfoResponseParam customerCustomerInfo(magento.CustomerCustomerInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerCustomerInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerCustomerInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerCustomerInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerCustomerUpdateResponseParam customerCustomerUpdate(magento.CustomerCustomerUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerCustomerUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerCustomerUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerCustomerUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerCustomerDeleteResponseParam customerCustomerDelete(magento.CustomerCustomerDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerCustomerDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerCustomerDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerCustomerDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerGroupListResponseParam customerGroupList(magento.CustomerGroupListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerGroupList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerGroupListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerGroupListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerGroupListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerAddressListResponseParam customerAddressList(magento.CustomerAddressListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerAddressListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerAddressListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerAddressListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerAddressCreateResponseParam customerAddressCreate(magento.CustomerAddressCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerAddressCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerAddressCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerAddressCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerAddressInfoResponseParam customerAddressInfo(magento.CustomerAddressInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerAddressInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerAddressInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerAddressInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerAddressUpdateResponseParam customerAddressUpdate(magento.CustomerAddressUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerAddressUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerAddressUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerAddressUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CustomerAddressDeleteResponseParam customerAddressDelete(magento.CustomerAddressDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CustomerAddressDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CustomerAddressDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CustomerAddressDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryCurrentStoreResponseParam catalogCategoryCurrentStore(magento.CatalogCategoryCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryTreeResponseParam catalogCategoryTree(magento.CatalogCategoryTreeRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryTree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryTreeResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryTreeResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryTreeResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryLevelResponseParam catalogCategoryLevel(magento.CatalogCategoryLevelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryLevelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryLevelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryLevelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryInfoResponseParam catalogCategoryInfo(magento.CatalogCategoryInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryCreateResponseParam catalogCategoryCreate(magento.CatalogCategoryCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryUpdateResponseParam catalogCategoryUpdate(magento.CatalogCategoryUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryMoveResponseParam catalogCategoryMove(magento.CatalogCategoryMoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryMove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryMoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryMoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryMoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryDeleteResponseParam catalogCategoryDelete(magento.CatalogCategoryDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryAssignedProductsResponseParam catalogCategoryAssignedProducts(magento.CatalogCategoryAssignedProductsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAssignedProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryAssignedProductsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryAssignedProductsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryAssignedProductsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryAssignProductResponseParam catalogCategoryAssignProduct(magento.CatalogCategoryAssignProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAssignProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryAssignProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryAssignProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryAssignProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryUpdateProductResponseParam catalogCategoryUpdateProduct(magento.CatalogCategoryUpdateProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryUpdateProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryUpdateProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryUpdateProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryUpdateProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryRemoveProductResponseParam catalogCategoryRemoveProduct(magento.CatalogCategoryRemoveProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryRemoveProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryRemoveProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryRemoveProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryRemoveProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductCurrentStoreResponseParam catalogProductCurrentStore(magento.CatalogProductCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductListResponseParam catalogProductList(magento.CatalogProductListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductInfoResponseParam catalogProductInfo(magento.CatalogProductInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductCreateResponseParam catalogProductCreate(magento.CatalogProductCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductUpdateResponseParam catalogProductUpdate(magento.CatalogProductUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductSetSpecialPriceResponseParam catalogProductSetSpecialPrice(magento.CatalogProductSetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductSetSpecialPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductSetSpecialPriceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductSetSpecialPriceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductSetSpecialPriceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductGetSpecialPriceResponseParam catalogProductGetSpecialPrice(magento.CatalogProductGetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductGetSpecialPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductGetSpecialPriceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductGetSpecialPriceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductGetSpecialPriceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductDeleteResponseParam catalogProductDelete(magento.CatalogProductDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeCurrentStoreResponseParam catalogProductAttributeCurrentStore(magento.CatalogProductAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeListResponseParam catalogProductAttributeList(magento.CatalogProductAttributeListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeOptionsResponseParam catalogProductAttributeOptions(magento.CatalogProductAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeOptionsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeOptionsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeOptionsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeSetListResponseParam catalogProductAttributeSetList(magento.CatalogProductAttributeSetListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeSetListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeSetListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeSetListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductTypeListResponseParam catalogProductTypeList(magento.CatalogProductTypeListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTypeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductTypeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductTypeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductTypeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeTierPriceInfoResponseParam catalogProductAttributeTierPriceInfo(magento.CatalogProductAttributeTierPriceInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeTierPriceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeTierPriceInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeTierPriceInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeTierPriceInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeTierPriceUpdateResponseParam catalogProductAttributeTierPriceUpdate(magento.CatalogProductAttributeTierPriceUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeTierPriceUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeTierPriceUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeTierPriceUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeTierPriceUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryAttributeCurrentStoreResponseParam catalogCategoryAttributeCurrentStore(magento.CatalogCategoryAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAttributeCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryAttributeCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryAttributeCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryAttributeCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryAttributeListResponseParam catalogCategoryAttributeList(magento.CatalogCategoryAttributeListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAttributeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryAttributeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryAttributeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryAttributeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogCategoryAttributeOptionsResponseParam catalogCategoryAttributeOptions(magento.CatalogCategoryAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAttributeOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogCategoryAttributeOptionsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogCategoryAttributeOptionsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogCategoryAttributeOptionsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeMediaCurrentStoreResponseParam catalogProductAttributeMediaCurrentStore(magento.CatalogProductAttributeMediaCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeMediaCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeMediaCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeMediaCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeMediaListResponseParam catalogProductAttributeMediaList(magento.CatalogProductAttributeMediaListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeMediaListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeMediaListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeMediaListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeMediaInfoResponseParam catalogProductAttributeMediaInfo(magento.CatalogProductAttributeMediaInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeMediaInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeMediaInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeMediaInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeMediaTypesResponseParam catalogProductAttributeMediaTypes(magento.CatalogProductAttributeMediaTypesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeMediaTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeMediaTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeMediaTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeMediaCreateResponseParam catalogProductAttributeMediaCreate(magento.CatalogProductAttributeMediaCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeMediaCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeMediaCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeMediaCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeMediaUpdateResponseParam catalogProductAttributeMediaUpdate(magento.CatalogProductAttributeMediaUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeMediaUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeMediaUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeMediaUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductAttributeMediaRemoveResponseParam catalogProductAttributeMediaRemove(magento.CatalogProductAttributeMediaRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductAttributeMediaRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductAttributeMediaRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductAttributeMediaRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductLinkListResponseParam catalogProductLinkList(magento.CatalogProductLinkListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductLinkListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductLinkListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductLinkListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductLinkAssignResponseParam catalogProductLinkAssign(magento.CatalogProductLinkAssignRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkAssign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductLinkAssignResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductLinkAssignResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductLinkAssignResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductLinkUpdateResponseParam catalogProductLinkUpdate(magento.CatalogProductLinkUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductLinkUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductLinkUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductLinkUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductLinkRemoveResponseParam catalogProductLinkRemove(magento.CatalogProductLinkRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductLinkRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductLinkRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductLinkRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductLinkTypesResponseParam catalogProductLinkTypes(magento.CatalogProductLinkTypesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductLinkTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductLinkTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductLinkTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductLinkAttributesResponseParam catalogProductLinkAttributes(magento.CatalogProductLinkAttributesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductLinkAttributesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductLinkAttributesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductLinkAttributesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderListResponseParam salesOrderList(magento.SalesOrderListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInfoResponseParam salesOrderInfo(magento.SalesOrderInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderAddCommentResponseParam salesOrderAddComment(magento.SalesOrderAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderHoldResponseParam salesOrderHold(magento.SalesOrderHoldRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderHold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderHoldResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderHoldResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderHoldResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderUnholdResponseParam salesOrderUnhold(magento.SalesOrderUnholdRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderUnhold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderUnholdResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderUnholdResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderUnholdResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderCancelResponseParam salesOrderCancel(magento.SalesOrderCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentListResponseParam salesOrderShipmentList(magento.SalesOrderShipmentListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentInfoResponseParam salesOrderShipmentInfo(magento.SalesOrderShipmentInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentCreateResponseParam salesOrderShipmentCreate(magento.SalesOrderShipmentCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentAddCommentResponseParam salesOrderShipmentAddComment(magento.SalesOrderShipmentAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentAddTrackResponseParam salesOrderShipmentAddTrack(magento.SalesOrderShipmentAddTrackRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentAddTrack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentAddTrackResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentAddTrackResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentAddTrackResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentRemoveTrackResponseParam salesOrderShipmentRemoveTrack(magento.SalesOrderShipmentRemoveTrackRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentRemoveTrack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentRemoveTrackResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentRemoveTrackResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentRemoveTrackResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentSendInfoResponseParam salesOrderShipmentSendInfo(magento.SalesOrderShipmentSendInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentSendInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentSendInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentSendInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentSendInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderShipmentGetCarriersResponseParam salesOrderShipmentGetCarriers(magento.SalesOrderShipmentGetCarriersRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentGetCarriers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderShipmentGetCarriersResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderShipmentGetCarriersResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderShipmentGetCarriersResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInvoiceListResponseParam salesOrderInvoiceList(magento.SalesOrderInvoiceListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInvoiceListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInvoiceListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInvoiceListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInvoiceInfoResponseParam salesOrderInvoiceInfo(magento.SalesOrderInvoiceInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInvoiceInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInvoiceInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInvoiceInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInvoiceCreateResponseParam salesOrderInvoiceCreate(magento.SalesOrderInvoiceCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInvoiceCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInvoiceCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInvoiceCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInvoiceAddCommentResponseParam salesOrderInvoiceAddComment(magento.SalesOrderInvoiceAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInvoiceAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInvoiceAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInvoiceAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInvoiceCaptureResponseParam salesOrderInvoiceCapture(magento.SalesOrderInvoiceCaptureRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceCapture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInvoiceCaptureResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInvoiceCaptureResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInvoiceCaptureResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInvoiceVoidResponseParam salesOrderInvoiceVoid(magento.SalesOrderInvoiceVoidRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceVoid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInvoiceVoidResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInvoiceVoidResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInvoiceVoidResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderInvoiceCancelResponseParam salesOrderInvoiceCancel(magento.SalesOrderInvoiceCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderInvoiceCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderInvoiceCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderInvoiceCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderCreditmemoListResponseParam salesOrderCreditmemoList(magento.SalesOrderCreditmemoListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderCreditmemoListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderCreditmemoListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderCreditmemoListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderCreditmemoInfoResponseParam salesOrderCreditmemoInfo(magento.SalesOrderCreditmemoInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderCreditmemoInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderCreditmemoInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderCreditmemoInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderCreditmemoCreateResponseParam salesOrderCreditmemoCreate(magento.SalesOrderCreditmemoCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderCreditmemoCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderCreditmemoCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderCreditmemoCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderCreditmemoAddCommentResponseParam salesOrderCreditmemoAddComment(magento.SalesOrderCreditmemoAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderCreditmemoAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderCreditmemoAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderCreditmemoAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SalesOrderCreditmemoCancelResponseParam salesOrderCreditmemoCancel(magento.SalesOrderCreditmemoCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SalesOrderCreditmemoCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SalesOrderCreditmemoCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SalesOrderCreditmemoCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogInventoryStockItemListResponseParam catalogInventoryStockItemList(magento.CatalogInventoryStockItemListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogInventoryStockItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogInventoryStockItemListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogInventoryStockItemListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogInventoryStockItemListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogInventoryStockItemUpdateResponseParam catalogInventoryStockItemUpdate(magento.CatalogInventoryStockItemUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogInventoryStockItemUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogInventoryStockItemUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogInventoryStockItemUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogInventoryStockItemUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartCreateResponseParam shoppingCartCreate(magento.ShoppingCartCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartInfoResponseParam shoppingCartInfo(magento.ShoppingCartInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartTotalsResponseParam shoppingCartTotals(magento.ShoppingCartTotalsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartTotals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartTotalsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartTotalsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartTotalsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartOrderResponseParam shoppingCartOrder(magento.ShoppingCartOrderRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartOrderResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartOrderResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartOrderResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartLicenseResponseParam shoppingCartLicense(magento.ShoppingCartLicenseRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartLicense"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartLicenseResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartLicenseResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartLicenseResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartProductAddResponseParam shoppingCartProductAdd(magento.ShoppingCartProductAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartProductAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartProductAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartProductAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartProductUpdateResponseParam shoppingCartProductUpdate(magento.ShoppingCartProductUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartProductUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartProductUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartProductUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartProductRemoveResponseParam shoppingCartProductRemove(magento.ShoppingCartProductRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartProductRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartProductRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartProductRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartProductListResponseParam shoppingCartProductList(magento.ShoppingCartProductListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartProductListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartProductListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartProductListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartProductMoveToCustomerQuoteResponseParam shoppingCartProductMoveToCustomerQuote(magento.ShoppingCartProductMoveToCustomerQuoteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductMoveToCustomerQuote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartProductMoveToCustomerQuoteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartProductMoveToCustomerQuoteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartProductMoveToCustomerQuoteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartCustomerSetResponseParam shoppingCartCustomerSet(magento.ShoppingCartCustomerSetRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCustomerSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartCustomerSetResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartCustomerSetResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartCustomerSetResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartCustomerAddressesResponseParam shoppingCartCustomerAddresses(magento.ShoppingCartCustomerAddressesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCustomerAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartCustomerAddressesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartCustomerAddressesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartCustomerAddressesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartShippingMethodResponseParam shoppingCartShippingMethod(magento.ShoppingCartShippingMethodRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartShippingMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartShippingMethodResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartShippingMethodResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartShippingMethodResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartShippingListResponseParam shoppingCartShippingList(magento.ShoppingCartShippingListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartShippingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartShippingListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartShippingListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartShippingListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartPaymentMethodResponseParam shoppingCartPaymentMethod(magento.ShoppingCartPaymentMethodRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartPaymentMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartPaymentMethodResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartPaymentMethodResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartPaymentMethodResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartPaymentListResponseParam shoppingCartPaymentList(magento.ShoppingCartPaymentListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartPaymentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartPaymentListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartPaymentListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartPaymentListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartCouponAddResponseParam shoppingCartCouponAdd(magento.ShoppingCartCouponAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCouponAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartCouponAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartCouponAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartCouponAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartCouponRemoveResponseParam shoppingCartCouponRemove(magento.ShoppingCartCouponRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCouponRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartCouponRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartCouponRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartCouponRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductTagListResponseParam catalogProductTagList(magento.CatalogProductTagListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductTagListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductTagListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductTagListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductTagInfoResponseParam catalogProductTagInfo(magento.CatalogProductTagInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductTagInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductTagInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductTagInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductTagAddResponseParam catalogProductTagAdd(magento.CatalogProductTagAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductTagAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductTagAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductTagAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductTagUpdateResponseParam catalogProductTagUpdate(magento.CatalogProductTagUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductTagUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductTagUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductTagUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductTagRemoveResponseParam catalogProductTagRemove(magento.CatalogProductTagRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductTagRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductTagRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductTagRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftMessageForQuoteResponseParam giftMessageSetForQuote(magento.GiftMessageForQuoteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftMessageSetForQuote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftMessageForQuoteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftMessageForQuoteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftMessageForQuoteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftMessageForQuoteItemResponseParam giftMessageSetForQuoteItem(magento.GiftMessageForQuoteItemRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftMessageSetForQuoteItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftMessageForQuoteItemResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftMessageForQuoteItemResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftMessageForQuoteItemResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftMessageForQuoteProductResponseParam giftMessageSetForQuoteProduct(magento.GiftMessageForQuoteProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftMessageSetForQuoteProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftMessageForQuoteProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftMessageForQuoteProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftMessageForQuoteProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.EnterpriseCustomerbalanceBalanceResponseParam enterpriseCustomerbalanceBalance(magento.EnterpriseCustomerbalanceBalanceRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enterpriseCustomerbalanceBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.EnterpriseCustomerbalanceBalanceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.EnterpriseCustomerbalanceBalanceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.EnterpriseCustomerbalanceBalanceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.EnterpriseCustomerbalanceHistoryResponseParam enterpriseCustomerbalanceHistory(magento.EnterpriseCustomerbalanceHistoryRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enterpriseCustomerbalanceHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.EnterpriseCustomerbalanceHistoryResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.EnterpriseCustomerbalanceHistoryResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.EnterpriseCustomerbalanceHistoryResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartCustomerbalanceSetAmountResponseParam shoppingCartCustomerbalanceSetAmount(magento.ShoppingCartCustomerbalanceSetAmountRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCustomerbalanceSetAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartCustomerbalanceSetAmountResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartCustomerbalanceSetAmountResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartCustomerbalanceSetAmountResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartCustomerbalanceRemoveAmountResponseParam shoppingCartCustomerbalanceRemoveAmount(magento.ShoppingCartCustomerbalanceRemoveAmountRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCustomerbalanceRemoveAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartCustomerbalanceRemoveAmountResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartCustomerbalanceRemoveAmountResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartCustomerbalanceRemoveAmountResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftcardAccountCreateResponseParam giftcardAccountCreate(magento.GiftcardAccountCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftcardAccountCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftcardAccountCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftcardAccountCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftcardAccountCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftcardAccountUpdateResponseParam giftcardAccountUpdate(magento.GiftcardAccountUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftcardAccountUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftcardAccountUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftcardAccountUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftcardAccountUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftcardAccountRemoveResponseParam giftcardAccountRemove(magento.GiftcardAccountRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftcardAccountRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftcardAccountRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftcardAccountRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftcardAccountRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftcardAccountListResponseParam giftcardAccountList(magento.GiftcardAccountListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftcardAccountList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftcardAccountListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftcardAccountListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftcardAccountListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftcardAccountInfoResponseParam giftcardAccountInfo(magento.GiftcardAccountInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftcardAccountInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftcardAccountInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftcardAccountInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftcardAccountInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftcardCustomerInfoResponseParam giftcardCustomerInfo(magento.GiftcardCustomerInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftcardCustomerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftcardCustomerInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftcardCustomerInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftcardCustomerInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.GiftcardCustomerRedeemResponseParam giftcardCustomerRedeem(magento.GiftcardCustomerRedeemRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftcardCustomerRedeem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.GiftcardCustomerRedeemResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.GiftcardCustomerRedeemResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.GiftcardCustomerRedeemResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartGiftcardAddResponseParam shoppingCartGiftcardAdd(magento.ShoppingCartGiftcardAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartGiftcardAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartGiftcardAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartGiftcardAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartGiftcardAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartGiftcardRemoveResponseParam shoppingCartGiftcardRemove(magento.ShoppingCartGiftcardRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartGiftcardRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartGiftcardRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartGiftcardRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartGiftcardRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.ShoppingCartGiftcardListResponseParam shoppingCartGiftcardList(magento.ShoppingCartGiftcardListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartGiftcardList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.ShoppingCartGiftcardListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.ShoppingCartGiftcardListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.ShoppingCartGiftcardListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogProductMultiUpdateResponseParam catalogProductMultiUpdate(magento.CatalogProductMultiUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductMultiUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogProductMultiUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogProductMultiUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogProductMultiUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.SaasRefreshCatalogResponseParam saasRefreshCatalog(magento.SaasRefreshCatalogRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saasRefreshCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.SaasRefreshCatalogResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.SaasRefreshCatalogResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.SaasRefreshCatalogResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public magento.CatalogInventoryStockItemMultiUpdateResponseParam catalogInventoryStockItemMultiUpdate(magento.CatalogInventoryStockItemMultiUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogInventoryStockItemMultiUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (magento.CatalogInventoryStockItemMultiUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (magento.CatalogInventoryStockItemMultiUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, magento.CatalogInventoryStockItemMultiUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
