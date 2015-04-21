package pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveCardWasteToFoundationController;
import entities.Card;
import entities.Figure;
import entities.Foundation;

public class MoveCardWasteToFoundation {
	private MoveCardWasteToFoundationController moveCardWasteToFoundation;
	private int lenghtFoundation;
	private Foundation foundation;
	@Before
	public void before() {
		foundation =new Foundation();
		lenghtFoundation = foundation.getSizeFundation() + 1;
		System.out.println("longitud" +lenghtFoundation);
		moveCardWasteToFoundation = new MoveCardWasteToFoundationController
				(new Card(1,Figure.DIAMONDS),foundation);
	}

	@Test
	public void moveCardWasteToFoundationTest(){
		assertEquals(lenghtFoundation,moveCardWasteToFoundation.getFoundation().getSizeFundation());
	}

	@Test
	public void isValidCardInFoundation(){
		assertTrue(moveCardWasteToFoundation.getFoundation().isValidCard(new Card(2,Figure.DIAMONDS)));
	}

	@Test
	public void isNotCompletedFoundation(){
		assertFalse(moveCardWasteToFoundation.getFoundation().isCompleted());
	}




}
