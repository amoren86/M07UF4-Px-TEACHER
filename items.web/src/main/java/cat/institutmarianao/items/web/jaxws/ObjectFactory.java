
package cat.institutmarianao.items.web.jaxws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cat.institutmarianao.items.web.jaxws package. 
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

    private static final QName _DecreaseStock_QNAME = new QName("http://service.ws.items.institutmarianao.cat/", "decreaseStock");
    private static final QName _DecreaseStockResponse_QNAME = new QName("http://service.ws.items.institutmarianao.cat/", "decreaseStockResponse");
    private static final QName _GetAllItems_QNAME = new QName("http://service.ws.items.institutmarianao.cat/", "getAllItems");
    private static final QName _GetAllItemsResponse_QNAME = new QName("http://service.ws.items.institutmarianao.cat/", "getAllItemsResponse");
    private static final QName _IncreaseStock_QNAME = new QName("http://service.ws.items.institutmarianao.cat/", "increaseStock");
    private static final QName _IncreaseStockResponse_QNAME = new QName("http://service.ws.items.institutmarianao.cat/", "increaseStockResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cat.institutmarianao.items.web.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecreaseStock }
     * 
     * @return
     *     the new instance of {@link DecreaseStock }
     */
    public DecreaseStock createDecreaseStock() {
        return new DecreaseStock();
    }

    /**
     * Create an instance of {@link DecreaseStockResponse }
     * 
     * @return
     *     the new instance of {@link DecreaseStockResponse }
     */
    public DecreaseStockResponse createDecreaseStockResponse() {
        return new DecreaseStockResponse();
    }

    /**
     * Create an instance of {@link GetAllItems }
     * 
     * @return
     *     the new instance of {@link GetAllItems }
     */
    public GetAllItems createGetAllItems() {
        return new GetAllItems();
    }

    /**
     * Create an instance of {@link GetAllItemsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllItemsResponse }
     */
    public GetAllItemsResponse createGetAllItemsResponse() {
        return new GetAllItemsResponse();
    }

    /**
     * Create an instance of {@link IncreaseStock }
     * 
     * @return
     *     the new instance of {@link IncreaseStock }
     */
    public IncreaseStock createIncreaseStock() {
        return new IncreaseStock();
    }

    /**
     * Create an instance of {@link IncreaseStockResponse }
     * 
     * @return
     *     the new instance of {@link IncreaseStockResponse }
     */
    public IncreaseStockResponse createIncreaseStockResponse() {
        return new IncreaseStockResponse();
    }

    /**
     * Create an instance of {@link Item }
     * 
     * @return
     *     the new instance of {@link Item }
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecreaseStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DecreaseStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.items.institutmarianao.cat/", name = "decreaseStock")
    public JAXBElement<DecreaseStock> createDecreaseStock(DecreaseStock value) {
        return new JAXBElement<>(_DecreaseStock_QNAME, DecreaseStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecreaseStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DecreaseStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.items.institutmarianao.cat/", name = "decreaseStockResponse")
    public JAXBElement<DecreaseStockResponse> createDecreaseStockResponse(DecreaseStockResponse value) {
        return new JAXBElement<>(_DecreaseStockResponse_QNAME, DecreaseStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItems }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllItems }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.items.institutmarianao.cat/", name = "getAllItems")
    public JAXBElement<GetAllItems> createGetAllItems(GetAllItems value) {
        return new JAXBElement<>(_GetAllItems_QNAME, GetAllItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllItemsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.items.institutmarianao.cat/", name = "getAllItemsResponse")
    public JAXBElement<GetAllItemsResponse> createGetAllItemsResponse(GetAllItemsResponse value) {
        return new JAXBElement<>(_GetAllItemsResponse_QNAME, GetAllItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncreaseStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncreaseStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.items.institutmarianao.cat/", name = "increaseStock")
    public JAXBElement<IncreaseStock> createIncreaseStock(IncreaseStock value) {
        return new JAXBElement<>(_IncreaseStock_QNAME, IncreaseStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncreaseStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncreaseStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.items.institutmarianao.cat/", name = "increaseStockResponse")
    public JAXBElement<IncreaseStockResponse> createIncreaseStockResponse(IncreaseStockResponse value) {
        return new JAXBElement<>(_IncreaseStockResponse_QNAME, IncreaseStockResponse.class, null, value);
    }

}
