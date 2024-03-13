import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

//Code by Samuel Lane 
public class Deck {
    Card a = new Card("Clubs", 1);
    Card b = new Card("Clubs", 2);
    Card c = new Card("Clubs", 3);
    Card d = new Card("Clubs", 4);
    Card e = new Card("Clubs", 5);
    Card f = new Card("Clubs", 6);
    Card g = new Card("Clubs", 7);
    Card h = new Card("Clubs", 8);
    Card i = new Card("Clubs", 9);
    Card j = new Card("Clubs", 10);
    Card k = new Card("Clubs", 11);
    Card l = new Card("Clubs", 12);
    Card m = new Card("Clubs", 13);
    Card n = new Card("Spades", 1);
    Card o = new Card("Spades", 2);
    Card p = new Card("Spades", 3);
    Card q = new Card("Spades", 4);
    Card r = new Card("Spades", 5);
    Card s = new Card("Spades", 6);
    Card t = new Card("Spades", 7);
    Card u = new Card("Spades", 8);
    Card v = new Card("Spades", 9);
    Card w = new Card("Spades", 10);
    Card x = new Card("Spades", 11);
    Card y = new Card("Spades", 12);
    Card z = new Card("Spades", 13);
    Card aa = new Card("Hearts", 1);
    Card ab = new Card("Hearts", 2);
    Card ac = new Card("Hearts", 3);
    Card ad = new Card("Hearts", 4);
    Card ae = new Card("Hearts", 5);
    Card af = new Card("Hearts", 6);
    Card ag = new Card("Hearts", 7);
    Card ah = new Card("Hearts", 8);
    Card ai = new Card("Hearts", 9);
    Card aj = new Card("Hearts", 10);
    Card ak = new Card("Hearts", 11);
    Card al = new Card("Hearts", 12);
    Card am = new Card("Hearts", 13);
    Card an = new Card("Diamonds", 1);
    Card ao = new Card("Diamonds", 2);
    Card ap = new Card("Diamonds", 3);
    Card aq = new Card("Diamonds", 4);
    Card ar = new Card("Diamonds", 5);
    Card as = new Card("Diamonds", 6);
    Card at = new Card("Diamonds", 7);
    Card au = new Card("Diamonds", 8);
    Card av = new Card("Diamonds", 9);
    Card aw = new Card("Diamonds", 10);
    Card ax = new Card("Diamonds", 11);
    Card ay = new Card("Diamonds", 12);
    Card az = new Card("Diamonds", 13);

    ArrayList<Card> deck = new ArrayList<>(
            Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, ab, ac, ad,
                    ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az));

    public Card drawCard() {
        int num = ThreadLocalRandom.current().nextInt(1, 53);

        Card output = new Card("", 0);
        // may throw an exception if duplicate integer is given
        switch (num) {
            case 1 -> {
                output = a;
                deck.remove(a);
            }
            case 2 -> {
                output = b;
                deck.remove(b);
            }
            case 3 -> {
                output = c;
                deck.remove(c);
            }
            case 4 -> {
                output = d;
                deck.remove(d);
            }
            case 5 -> {
                output = e;
                deck.remove(e);
            }
            case 6 -> {
                output = f;
                deck.remove(f);
            }
            case 7 -> {
                output = g;
                deck.remove(g);
            }
            case 8 -> {
                output = h;
                deck.remove(h);
            }
            case 9 -> {
                output = i;
                deck.remove(i);
            }
            case 10 -> {
                output = j;
                deck.remove(j);
            }
            case 11 -> {
                output = k;
                deck.remove(k);
            }
            case 12 -> {
                output = l;
                deck.remove(l);
            }
            case 13 -> {
                output = m;
                deck.remove(m);
            }
            case 14 -> {
                output = n;
                deck.remove(n);
            }
            case 15 -> {
                output = o;
                deck.remove(o);
            }
            case 16 -> {
                output = p;
                deck.remove(p);
            }
            case 17 -> {
                output = q;
                deck.remove(q);
            }
            case 18 -> {
                output = r;
                deck.remove(r);
            }
            case 19 -> {
                output = s;
                deck.remove(s);
            }
            case 20 -> {
                output = t;
                deck.remove(t);
            }
            case 21 -> {
                output = u;
                deck.remove(u);
            }
            case 22 -> {
                output = v;
                deck.remove(v);
            }
            case 23 -> {
                output = w;
                deck.remove(w);
            }
            case 24 -> {
                output = x;
                deck.remove(x);
            }
            case 25 -> {
                output = y;
                deck.remove(y);
            }
            case 26 -> {
                output = z;
                deck.remove(z);
            }
            case 27 -> {
                output = aa;
                deck.remove(aa);
            }
            case 28 -> {
                output = ab;
                deck.remove(ab);
            }
            case 29 -> {
                output = ac;
                deck.remove(ac);
            }
            case 30 -> {
                output = ad;
                deck.remove(ad);
            }
            case 31 -> {
                output = ae;
                deck.remove(ae);
            }
            case 32 -> {
                output = af;
                deck.remove(af);
            }
            case 33 -> {
                output = ag;
                deck.remove(ag);
            }
            case 34 -> {
                output = ah;
                deck.remove(ah);
            }
            case 35 -> {
                output = ai;
                deck.remove(ai);
            }
            case 36 -> {
                output = aj;
                deck.remove(aj);
            }
            case 37 -> {
                output = ak;
                deck.remove(ak);
            }
            case 38 -> {
                output = al;
                deck.remove(al);
            }
            case 39 -> {
                output = am;
                deck.remove(am);
            }
            case 40 -> {
                output = an;
                deck.remove(an);
            }
            case 41 -> {
                output = ao;
                deck.remove(ao);
            }
            case 42 -> {
                output = ap;
                deck.remove(ap);
            }
            case 43 -> {
                output = aq;
                deck.remove(aq);
            }
            case 44 -> {
                output = ar;
                deck.remove(ar);
            }
            case 45 -> {
                output = as;
                deck.remove(as);
            }
            case 46 -> {
                output = at;
                deck.remove(at);
            }
            case 47 -> {
                output = au;
                deck.remove(au);
            }
            case 48 -> {
                output = av;
                deck.remove(av);
            }
            case 49 -> {
                output = aw;
                deck.remove(aw);
            }
            case 50 -> {
                output = ax;
                deck.remove(ax);
            }
            case 51 -> {
                output = ay;
                deck.remove(ay);
            }
            case 52 -> {
                output = az;
                deck.remove(az);
            }
        }
        return output;
    }

}
