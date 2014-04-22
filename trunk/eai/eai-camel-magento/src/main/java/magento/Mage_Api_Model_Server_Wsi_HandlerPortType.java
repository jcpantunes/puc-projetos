/**
 * Mage_Api_Model_Server_Wsi_HandlerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package magento;

public interface Mage_Api_Model_Server_Wsi_HandlerPortType extends java.rmi.Remote {

    /**
     * Call api functionality
     */
    public magento.CallResponseParam call(magento.CallParam parameters) throws java.rmi.RemoteException;

    /**
     * Multiple calls of resource functionality
     */
    public magento.MultiCallResponseParam multiCall(magento.MultiCallParam parameters) throws java.rmi.RemoteException;

    /**
     * End web service session
     */
    public magento.EndSessionResponseParam endSession(magento.EndSessionParam parameters) throws java.rmi.RemoteException;

    /**
     * Login user and retrive session id
     */
    public magento.LoginResponseParam login(magento.LoginParam parameters) throws java.rmi.RemoteException;

    /**
     * Start web service session
     */
    public magento.StartSessionResponseParam startSession() throws java.rmi.RemoteException;

    /**
     * List of available resources
     */
    public magento.ResourcesResponseParam resources(magento.ResourcesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of global faults
     */
    public magento.GlobalFaultsResponseParam globalFaults(magento.GlobalFaultsParam parameters) throws java.rmi.RemoteException;

    /**
     * List of resource faults
     */
    public magento.ResourceFaultsResponseParam resourceFaults(magento.ResourceFaultsParam parameters) throws java.rmi.RemoteException;

    /**
     * List of stores
     */
    public magento.StoreListResponseParam storeList(magento.StoreListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Store view info
     */
    public magento.StoreInfoResponseParam storeInfo(magento.StoreInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of countries
     */
    public magento.DirectoryCountryListResponseParam directoryCountryList(magento.DirectoryCountryListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of regions in specified country
     */
    public magento.DirectoryRegionListResponseParam directoryRegionList(magento.DirectoryRegionListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customers
     */
    public magento.CustomerCustomerListResponseParam customerCustomerList(magento.CustomerCustomerListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create customer
     */
    public magento.CustomerCustomerCreateResponseParam customerCustomerCreate(magento.CustomerCustomerCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer data
     */
    public magento.CustomerCustomerInfoResponseParam customerCustomerInfo(magento.CustomerCustomerInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update customer data
     */
    public magento.CustomerCustomerUpdateResponseParam customerCustomerUpdate(magento.CustomerCustomerUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete customer
     */
    public magento.CustomerCustomerDeleteResponseParam customerCustomerDelete(magento.CustomerCustomerDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer groups
     */
    public magento.CustomerGroupListResponseParam customerGroupList(magento.CustomerGroupListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer addresses
     */
    public magento.CustomerAddressListResponseParam customerAddressList(magento.CustomerAddressListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create customer address
     */
    public magento.CustomerAddressCreateResponseParam customerAddressCreate(magento.CustomerAddressCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer address data
     */
    public magento.CustomerAddressInfoResponseParam customerAddressInfo(magento.CustomerAddressInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update customer address data
     */
    public magento.CustomerAddressUpdateResponseParam customerAddressUpdate(magento.CustomerAddressUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete customer address
     */
    public magento.CustomerAddressDeleteResponseParam customerAddressDelete(magento.CustomerAddressDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set_Get current store view
     */
    public magento.CatalogCategoryCurrentStoreResponseParam catalogCategoryCurrentStore(magento.CatalogCategoryCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public magento.CatalogCategoryTreeResponseParam catalogCategoryTree(magento.CatalogCategoryTreeRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public magento.CatalogCategoryLevelResponseParam catalogCategoryLevel(magento.CatalogCategoryLevelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public magento.CatalogCategoryInfoResponseParam catalogCategoryInfo(magento.CatalogCategoryInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new category and return its id.
     */
    public magento.CatalogCategoryCreateResponseParam catalogCategoryCreate(magento.CatalogCategoryCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update category
     */
    public magento.CatalogCategoryUpdateResponseParam catalogCategoryUpdate(magento.CatalogCategoryUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Move category in tree
     */
    public magento.CatalogCategoryMoveResponseParam catalogCategoryMove(magento.CatalogCategoryMoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete category
     */
    public magento.CatalogCategoryDeleteResponseParam catalogCategoryDelete(magento.CatalogCategoryDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of assigned products
     */
    public magento.CatalogCategoryAssignedProductsResponseParam catalogCategoryAssignedProducts(magento.CatalogCategoryAssignedProductsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Assign product to category
     */
    public magento.CatalogCategoryAssignProductResponseParam catalogCategoryAssignProduct(magento.CatalogCategoryAssignProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update assigned product
     */
    public magento.CatalogCategoryUpdateProductResponseParam catalogCategoryUpdateProduct(magento.CatalogCategoryUpdateProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product assignment from category
     */
    public magento.CatalogCategoryRemoveProductResponseParam catalogCategoryRemoveProduct(magento.CatalogCategoryRemoveProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public magento.CatalogCategoryAttributeCurrentStoreResponseParam catalogCategoryAttributeCurrentStore(magento.CatalogCategoryAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve category attributes
     */
    public magento.CatalogCategoryAttributeListResponseParam catalogCategoryAttributeList(magento.CatalogCategoryAttributeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public magento.CatalogCategoryAttributeOptionsResponseParam catalogCategoryAttributeOptions(magento.CatalogCategoryAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public magento.CatalogProductCurrentStoreResponseParam catalogProductCurrentStore(magento.CatalogProductCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve products list by filters
     */
    public magento.CatalogProductListResponseParam catalogProductList(magento.CatalogProductListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product
     */
    public magento.CatalogProductInfoResponseParam catalogProductInfo(magento.CatalogProductInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new product and return product id
     */
    public magento.CatalogProductCreateResponseParam catalogProductCreate(magento.CatalogProductCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product
     */
    public magento.CatalogProductUpdateResponseParam catalogProductUpdate(magento.CatalogProductUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product special price
     */
    public magento.CatalogProductSetSpecialPriceResponseParam catalogProductSetSpecialPrice(magento.CatalogProductSetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get product special price data
     */
    public magento.CatalogProductGetSpecialPriceResponseParam catalogProductGetSpecialPrice(magento.CatalogProductGetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete product
     */
    public magento.CatalogProductDeleteResponseParam catalogProductDelete(magento.CatalogProductDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public magento.CatalogProductAttributeCurrentStoreResponseParam catalogProductAttributeCurrentStore(magento.CatalogProductAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute list
     */
    public magento.CatalogProductAttributeListResponseParam catalogProductAttributeList(magento.CatalogProductAttributeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public magento.CatalogProductAttributeOptionsResponseParam catalogProductAttributeOptions(magento.CatalogProductAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product attribute sets
     */
    public magento.CatalogProductAttributeSetListResponseParam catalogProductAttributeSetList(magento.CatalogProductAttributeSetListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product types
     */
    public magento.CatalogProductTypeListResponseParam catalogProductTypeList(magento.CatalogProductTypeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product tier prices
     */
    public magento.CatalogProductAttributeTierPriceInfoResponseParam catalogProductAttributeTierPriceInfo(magento.CatalogProductAttributeTierPriceInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product tier prices
     */
    public magento.CatalogProductAttributeTierPriceUpdateResponseParam catalogProductAttributeTierPriceUpdate(magento.CatalogProductAttributeTierPriceUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public magento.CatalogProductAttributeMediaCurrentStoreResponseParam catalogProductAttributeMediaCurrentStore(magento.CatalogProductAttributeMediaCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image list
     */
    public magento.CatalogProductAttributeMediaListResponseParam catalogProductAttributeMediaList(magento.CatalogProductAttributeMediaListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image data
     */
    public magento.CatalogProductAttributeMediaInfoResponseParam catalogProductAttributeMediaInfo(magento.CatalogProductAttributeMediaInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image types
     */
    public magento.CatalogProductAttributeMediaTypesResponseParam catalogProductAttributeMediaTypes(magento.CatalogProductAttributeMediaTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Upload new product image
     */
    public magento.CatalogProductAttributeMediaCreateResponseParam catalogProductAttributeMediaCreate(magento.CatalogProductAttributeMediaCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product image
     */
    public magento.CatalogProductAttributeMediaUpdateResponseParam catalogProductAttributeMediaUpdate(magento.CatalogProductAttributeMediaUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product image
     */
    public magento.CatalogProductAttributeMediaRemoveResponseParam catalogProductAttributeMediaRemove(magento.CatalogProductAttributeMediaRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve linked products
     */
    public magento.CatalogProductLinkListResponseParam catalogProductLinkList(magento.CatalogProductLinkListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Assign product link
     */
    public magento.CatalogProductLinkAssignResponseParam catalogProductLinkAssign(magento.CatalogProductLinkAssignRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product link
     */
    public magento.CatalogProductLinkUpdateResponseParam catalogProductLinkUpdate(magento.CatalogProductLinkUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product link
     */
    public magento.CatalogProductLinkRemoveResponseParam catalogProductLinkRemove(magento.CatalogProductLinkRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product link types
     */
    public magento.CatalogProductLinkTypesResponseParam catalogProductLinkTypes(magento.CatalogProductLinkTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product link type attributes
     */
    public magento.CatalogProductLinkAttributesResponseParam catalogProductLinkAttributes(magento.CatalogProductLinkAttributesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of orders by filters
     */
    public magento.SalesOrderListResponseParam salesOrderList(magento.SalesOrderListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve order information
     */
    public magento.SalesOrderInfoResponseParam salesOrderInfo(magento.SalesOrderInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add comment to order
     */
    public magento.SalesOrderAddCommentResponseParam salesOrderAddComment(magento.SalesOrderAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Hold order
     */
    public magento.SalesOrderHoldResponseParam salesOrderHold(magento.SalesOrderHoldRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Unhold order
     */
    public magento.SalesOrderUnholdResponseParam salesOrderUnhold(magento.SalesOrderUnholdRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel order
     */
    public magento.SalesOrderCancelResponseParam salesOrderCancel(magento.SalesOrderCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of shipments by filters
     */
    public magento.SalesOrderShipmentListResponseParam salesOrderShipmentList(magento.SalesOrderShipmentListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve shipment information
     */
    public magento.SalesOrderShipmentInfoResponseParam salesOrderShipmentInfo(magento.SalesOrderShipmentInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new shipment for order
     */
    public magento.SalesOrderShipmentCreateResponseParam salesOrderShipmentCreate(magento.SalesOrderShipmentCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public magento.SalesOrderShipmentAddCommentResponseParam salesOrderShipmentAddComment(magento.SalesOrderShipmentAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new tracking number
     */
    public magento.SalesOrderShipmentAddTrackResponseParam salesOrderShipmentAddTrack(magento.SalesOrderShipmentAddTrackRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove tracking number
     */
    public magento.SalesOrderShipmentRemoveTrackResponseParam salesOrderShipmentRemoveTrack(magento.SalesOrderShipmentRemoveTrackRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send shipment info
     */
    public magento.SalesOrderShipmentSendInfoResponseParam salesOrderShipmentSendInfo(magento.SalesOrderShipmentSendInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of allowed carriers for order
     */
    public magento.SalesOrderShipmentGetCarriersResponseParam salesOrderShipmentGetCarriers(magento.SalesOrderShipmentGetCarriersRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of invoices by filters
     */
    public magento.SalesOrderInvoiceListResponseParam salesOrderInvoiceList(magento.SalesOrderInvoiceListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve invoice information
     */
    public magento.SalesOrderInvoiceInfoResponseParam salesOrderInvoiceInfo(magento.SalesOrderInvoiceInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new invoice for order
     */
    public magento.SalesOrderInvoiceCreateResponseParam salesOrderInvoiceCreate(magento.SalesOrderInvoiceCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public magento.SalesOrderInvoiceAddCommentResponseParam salesOrderInvoiceAddComment(magento.SalesOrderInvoiceAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Capture invoice
     */
    public magento.SalesOrderInvoiceCaptureResponseParam salesOrderInvoiceCapture(magento.SalesOrderInvoiceCaptureRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Void invoice
     */
    public magento.SalesOrderInvoiceVoidResponseParam salesOrderInvoiceVoid(magento.SalesOrderInvoiceVoidRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel invoice
     */
    public magento.SalesOrderInvoiceCancelResponseParam salesOrderInvoiceCancel(magento.SalesOrderInvoiceCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of creditmemos by filters
     */
    public magento.SalesOrderCreditmemoListResponseParam salesOrderCreditmemoList(magento.SalesOrderCreditmemoListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve creditmemo information
     */
    public magento.SalesOrderCreditmemoInfoResponseParam salesOrderCreditmemoInfo(magento.SalesOrderCreditmemoInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new creditmemo for order
     */
    public magento.SalesOrderCreditmemoCreateResponseParam salesOrderCreditmemoCreate(magento.SalesOrderCreditmemoCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to creditmemo
     */
    public magento.SalesOrderCreditmemoAddCommentResponseParam salesOrderCreditmemoAddComment(magento.SalesOrderCreditmemoAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel creditmemo
     */
    public magento.SalesOrderCreditmemoCancelResponseParam salesOrderCreditmemoCancel(magento.SalesOrderCreditmemoCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve stock data by product ids
     */
    public magento.CatalogInventoryStockItemListResponseParam catalogInventoryStockItemList(magento.CatalogInventoryStockItemListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product stock data
     */
    public magento.CatalogInventoryStockItemUpdateResponseParam catalogInventoryStockItemUpdate(magento.CatalogInventoryStockItemUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create shopping cart
     */
    public magento.ShoppingCartCreateResponseParam shoppingCartCreate(magento.ShoppingCartCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve information about shopping cart
     */
    public magento.ShoppingCartInfoResponseParam shoppingCartInfo(magento.ShoppingCartInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create an order from shopping cart
     */
    public magento.ShoppingCartOrderResponseParam shoppingCartOrder(magento.ShoppingCartOrderRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get total prices for shopping cart
     */
    public magento.ShoppingCartTotalsResponseParam shoppingCartTotals(magento.ShoppingCartTotalsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get terms and conditions
     */
    public magento.ShoppingCartLicenseResponseParam shoppingCartLicense(magento.ShoppingCartLicenseRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add product(s) to shopping cart
     */
    public magento.ShoppingCartProductAddResponseParam shoppingCartProductAdd(magento.ShoppingCartProductAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product(s) quantities in shopping cart
     */
    public magento.ShoppingCartProductUpdateResponseParam shoppingCartProductUpdate(magento.ShoppingCartProductUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product(s) from shopping cart
     */
    public magento.ShoppingCartProductRemoveResponseParam shoppingCartProductRemove(magento.ShoppingCartProductRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of products in shopping cart
     */
    public magento.ShoppingCartProductListResponseParam shoppingCartProductList(magento.ShoppingCartProductListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Move product(s) to customer quote
     */
    public magento.ShoppingCartProductMoveToCustomerQuoteResponseParam shoppingCartProductMoveToCustomerQuote(magento.ShoppingCartProductMoveToCustomerQuoteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set customer for shopping cart
     */
    public magento.ShoppingCartCustomerSetResponseParam shoppingCartCustomerSet(magento.ShoppingCartCustomerSetRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set customer's addresses in shopping cart
     */
    public magento.ShoppingCartCustomerAddressesResponseParam shoppingCartCustomerAddresses(magento.ShoppingCartCustomerAddressesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set shipping method
     */
    public magento.ShoppingCartShippingMethodResponseParam shoppingCartShippingMethod(magento.ShoppingCartShippingMethodRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available shipping methods
     */
    public magento.ShoppingCartShippingListResponseParam shoppingCartShippingList(magento.ShoppingCartShippingListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set payment method
     */
    public magento.ShoppingCartPaymentMethodResponseParam shoppingCartPaymentMethod(magento.ShoppingCartPaymentMethodRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available payment methods
     */
    public magento.ShoppingCartPaymentListResponseParam shoppingCartPaymentList(magento.ShoppingCartPaymentListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add coupon code for shopping cart
     */
    public magento.ShoppingCartCouponAddResponseParam shoppingCartCouponAdd(magento.ShoppingCartCouponAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove coupon code from shopping cart
     */
    public magento.ShoppingCartCouponRemoveResponseParam shoppingCartCouponRemove(magento.ShoppingCartCouponRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of tags by product
     */
    public magento.CatalogProductTagListResponseParam catalogProductTagList(magento.CatalogProductTagListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product tag info
     */
    public magento.CatalogProductTagInfoResponseParam catalogProductTagInfo(magento.CatalogProductTagInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add tag(s) to product
     */
    public magento.CatalogProductTagAddResponseParam catalogProductTagAdd(magento.CatalogProductTagAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product tag
     */
    public magento.CatalogProductTagUpdateResponseParam catalogProductTagUpdate(magento.CatalogProductTagUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product tag
     */
    public magento.CatalogProductTagRemoveResponseParam catalogProductTagRemove(magento.CatalogProductTagRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set a gift message to the cart
     */
    public magento.GiftMessageForQuoteResponseParam giftMessageSetForQuote(magento.GiftMessageForQuoteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote item
     */
    public magento.GiftMessageForQuoteItemResponseParam giftMessageSetForQuoteItem(magento.GiftMessageForQuoteItemRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote items by products
     */
    public magento.GiftMessageForQuoteProductResponseParam giftMessageSetForQuoteProduct(magento.GiftMessageForQuoteProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer store credit balance information
     */
    public magento.EnterpriseCustomerbalanceBalanceResponseParam enterpriseCustomerbalanceBalance(magento.EnterpriseCustomerbalanceBalanceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer store credit history information
     */
    public magento.EnterpriseCustomerbalanceHistoryResponseParam enterpriseCustomerbalanceHistory(magento.EnterpriseCustomerbalanceHistoryRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set amount from customer store credit into shopping cart (quote)
     */
    public magento.ShoppingCartCustomerbalanceSetAmountResponseParam shoppingCartCustomerbalanceSetAmount(magento.ShoppingCartCustomerbalanceSetAmountRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove amount from shopping cart (quote) and increase customer
     * store credit
     */
    public magento.ShoppingCartCustomerbalanceRemoveAmountResponseParam shoppingCartCustomerbalanceRemoveAmount(magento.ShoppingCartCustomerbalanceRemoveAmountRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create gift card account
     */
    public magento.GiftcardAccountCreateResponseParam giftcardAccountCreate(magento.GiftcardAccountCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove gift card account
     */
    public magento.GiftcardAccountUpdateResponseParam giftcardAccountUpdate(magento.GiftcardAccountUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove gift card account
     */
    public magento.GiftcardAccountRemoveResponseParam giftcardAccountRemove(magento.GiftcardAccountRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove gift card account
     */
    public magento.GiftcardAccountListResponseParam giftcardAccountList(magento.GiftcardAccountListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove gift card account
     */
    public magento.GiftcardAccountInfoResponseParam giftcardAccountInfo(magento.GiftcardAccountInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve gift card data
     */
    public magento.GiftcardCustomerInfoResponseParam giftcardCustomerInfo(magento.GiftcardCustomerInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Redeem gift card amount
     */
    public magento.GiftcardCustomerRedeemResponseParam giftcardCustomerRedeem(magento.GiftcardCustomerRedeemRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Redeem gift card amount
     */
    public magento.ShoppingCartGiftcardAddResponseParam shoppingCartGiftcardAdd(magento.ShoppingCartGiftcardAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Redeem gift card amount
     */
    public magento.ShoppingCartGiftcardRemoveResponseParam shoppingCartGiftcardRemove(magento.ShoppingCartGiftcardRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Redeem gift card amount
     */
    public magento.ShoppingCartGiftcardListResponseParam shoppingCartGiftcardList(magento.ShoppingCartGiftcardListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Multi update product stock data
     */
    public magento.CatalogProductMultiUpdateResponseParam catalogProductMultiUpdate(magento.CatalogProductMultiUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Refresh catalog
     */
    public magento.SaasRefreshCatalogResponseParam saasRefreshCatalog(magento.SaasRefreshCatalogRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Multi update product stock data
     */
    public magento.CatalogInventoryStockItemMultiUpdateResponseParam catalogInventoryStockItemMultiUpdate(magento.CatalogInventoryStockItemMultiUpdateRequestParam parameters) throws java.rmi.RemoteException;
}
