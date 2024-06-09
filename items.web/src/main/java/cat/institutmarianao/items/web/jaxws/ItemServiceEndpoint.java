
package cat.institutmarianao.items.web.jaxws;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ItemServiceEndpoint", targetNamespace = "http://service.ws.items.institutmarianao.cat/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ItemServiceEndpoint {


    /**
     * 
     * @param arg0
     * @return
     *     returns cat.institutmarianao.items.web.jaxws.Item
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "increaseStock", targetNamespace = "http://service.ws.items.institutmarianao.cat/", className = "cat.institutmarianao.items.web.jaxws.IncreaseStock")
    @ResponseWrapper(localName = "increaseStockResponse", targetNamespace = "http://service.ws.items.institutmarianao.cat/", className = "cat.institutmarianao.items.web.jaxws.IncreaseStockResponse")
    @Action(input = "http://service.ws.items.institutmarianao.cat/ItemServiceEndpoint/increaseStockRequest", output = "http://service.ws.items.institutmarianao.cat/ItemServiceEndpoint/increaseStockResponse")
    public Item increaseStock(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<cat.institutmarianao.items.web.jaxws.Item>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllItems", targetNamespace = "http://service.ws.items.institutmarianao.cat/", className = "cat.institutmarianao.items.web.jaxws.GetAllItems")
    @ResponseWrapper(localName = "getAllItemsResponse", targetNamespace = "http://service.ws.items.institutmarianao.cat/", className = "cat.institutmarianao.items.web.jaxws.GetAllItemsResponse")
    @Action(input = "http://service.ws.items.institutmarianao.cat/ItemServiceEndpoint/getAllItemsRequest", output = "http://service.ws.items.institutmarianao.cat/ItemServiceEndpoint/getAllItemsResponse")
    public List<Item> getAllItems();

    /**
     * 
     * @param arg0
     * @return
     *     returns cat.institutmarianao.items.web.jaxws.Item
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "decreaseStock", targetNamespace = "http://service.ws.items.institutmarianao.cat/", className = "cat.institutmarianao.items.web.jaxws.DecreaseStock")
    @ResponseWrapper(localName = "decreaseStockResponse", targetNamespace = "http://service.ws.items.institutmarianao.cat/", className = "cat.institutmarianao.items.web.jaxws.DecreaseStockResponse")
    @Action(input = "http://service.ws.items.institutmarianao.cat/ItemServiceEndpoint/decreaseStockRequest", output = "http://service.ws.items.institutmarianao.cat/ItemServiceEndpoint/decreaseStockResponse")
    public Item decreaseStock(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}