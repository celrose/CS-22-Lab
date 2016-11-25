public class CharacterTester {
	
	public static void main(String[] args) {

		Character queen = new Queen(new BowAndArrowBehavior());
		Character king = new King(new KnifeBehavior());
		Character knight = new Knight(new SwordBehavior());
		Character troll = new Troll(new AxeBehavior());

		queen.fight();
		king.fight();
		knight.fight();
		troll.fight();

		queen.setWeapon(new KnifeBehavior());
		queen.fight();
	}
}
