Fighter simulation - user can choose number of rounds between 0 and 1000.
Fight is not to death. First fighter to reach 15 hp loses.
For the new round hp are restored to original value.

Fighters gain experience. Experience increases level of fighter. Level affects damage.

1. A fighter has:
  - max hit points (0-100]
  - min damage (0-5], increased with the number ot level reached.
  - max damage [5-10], increased with the number ot level reached.
  - experience - starts with 0


2. A Fighter can:
  - gain levels [1-5]:
    - modify damage.
  - hit:
      - chance for kick (0-100%) - (125% of basic damage);
      - chance for fist hit (100% - kickchance) - (75% of basic damage);
      - chance to make critical hit (0-100%) - (double damage - no dodge or block possible);
      - chance to dodge (0-100%) - (avaoid damage);
      - chance to block damage (0-100%) - (reflect half of the damage when being hit)
  - dodge;
  - block;
