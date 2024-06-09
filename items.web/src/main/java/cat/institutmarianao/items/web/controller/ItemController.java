package cat.institutmarianao.items.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cat.institutmarianao.items.web.jaxws.ItemService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ItemController {
	private final ItemService itemsWebService = new ItemService();

	@GetMapping(value = "/")
	public ModelAndView items(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelview = new ModelAndView("items");
		modelview.getModelMap().addAttribute("items", itemsWebService.getItemServiceEndpointImplPort().getAllItems());
		return modelview;
	}

	@GetMapping("/decreaseStock")
	public String decreaseStock(@RequestParam("ref") String ref, HttpServletRequest request,
			HttpServletResponse response) {
		itemsWebService.getItemServiceEndpointImplPort().decreaseStock(ref);
		return "redirect:/";
	}

	@GetMapping("/increaseStock")
	public String increaseStock(@RequestParam("ref") String ref, HttpServletRequest request,
			HttpServletResponse response) {
		itemsWebService.getItemServiceEndpointImplPort().increaseStock(ref);
		return "redirect:/";
	}
}
