package pruebas;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

import main.Card;
import main.Figure;
import main.MoveCardDeckToWasteController;
import main.StartGameController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardDeckToWaste {
	private MoveCardDeckToWasteController moveCardDeckToWasteController;
	private Stack<Card> wasteCards;
	private Stack<Card> deckCards;
	@Before
	public void before() {
		deckCards = new Stack<Card>();
		for (int i = 0; i < 5; i++) {
			deckCards.add(new Card(i, Figure.DIAMONDS));
		}
		moveCardDeckToWasteController = new MoveCardDeckToWasteController(deckCards);
		wasteCards = moveCardDeckToWasteController.getWaste();
	}

	@Test
	public void isNotEmptyWaste(){
		assertTrue(!wasteCards.isEmpty());
	}

	@Test
	public void sizeWaste(){
		assertEquals(3,moveCardDeckToWasteController.getWaste().size());

	}
	@Test
	public void sizeDeck(){
		assertEquals(2,moveCardDeckToWasteController.getDeckCards().size());

	}



}