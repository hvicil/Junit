package com.app.service;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

//Birim testi sadece bir birimi test eder, o nedenle baðýmlýlýklarýn izole edilmesi gerekir.
//böylece baðýmlýlýklarýn yan etkilerinin önlenmesi saðlanýr.
//Gerçek nesneler  beklenmedik durumlara neden olabilir.
//Gerçek nesneler yavaþ çalýþabilir ve zor bir þekilde yapýlandýrýlýr.
//Gerçek nesneler tekrar edilebilir olmayabilir.
//JAva da mocking iþlemlerini yapabilmek için Mockito, JMockit ve EasyMock kütüphaneler kullanýlabilir.
//

class MessageServiceTest1 {

	@Test
	void addMessageTest() {
		MessageService service = mock(MessageService.class);

		service.addMessage("Merhaba");
		service.addMessage("Mockito");

		verify(service).addMessage("Mockito");

	}

	@Test
	void howManyCallTest() {
		MessageService service = mock(MessageService.class);

		service.addMessage("Merhaba");
		service.addMessage("Merhaba");
		service.addMessage("Mockito");

		// verify(service,times(2)).addMessage("Merhaba");

		// verify(service,never()).removeMessage(any());

		verify(service, atLeast(2)).addMessage("Merhaba");

	}

	@Test
	void callOrderTest() {
		MessageService service = mock(MessageService.class);

		service.addMessage("Merhaba");
		service.addMessage("Mockito");
		
		InOrder inOrder=inOrder(service);
		
		inOrder.verify(service).addMessage("Merhaba");
		inOrder.verify(service).addMessage("Mockito");
		
		
	}

}