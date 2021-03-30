package ntou.cs.hw4.mask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ntou.cs.hw4.mask.controller.PharmacyController;
import ntou.cs.hw4.mask.entity.Pharmacy;
import ntou.cs.hw4.mask.model.MaskHandler;

@SpringBootTest
class MaskApplicationTests {

	@Test
	public void contextLoads() {
		PharmacyController controller = new PharmacyController();
		String res = controller.test();
		assertEquals("test",res);
	}

}
