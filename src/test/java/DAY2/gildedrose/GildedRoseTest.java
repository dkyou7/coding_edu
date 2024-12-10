package DAY2.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String NONAME = "noname";
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";

    @Test
    public void should_be_nothing_when_no_item() {
        // given (arrange)
        Item[] items = new Item[]{};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(0, items.length);
    }

    @Test
    public void noname_sellin_0_quality_0() {
        // given (arrange)
        Item[] items = new Item[]{new Item(NONAME, 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void noname_sellin_0_quality_1() {
        // given (arrange)
        Item[] items = new Item[]{new Item(NONAME, 0, 1)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void sulfuras_sellin_0_quality_80 () {
        // given (arrange)
        Item[] items = new Item[]{new Item(SULFURAS, 0, 80)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }

    @Test
    public void agedBrie_sellin_0_quality_0() {
        // given (arrange)
        Item[] items = new Item[]{new Item(AGED_BRIE, 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-1, items[0].sellIn);
        assertEquals(2, items[0].quality);
    }

    @Test
    public void backstage_pass_sellin_0_quality_0() {
        // given (arrange)
        Item[] items = new Item[]{new Item(BACKSTAGE_PASS, 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void backstage_pass_sellin_0_quality_49() {
        // given (arrange)
        Item[] items = new Item[]{new Item(BACKSTAGE_PASS, 0, 49)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void backstage_pass_sellin_12_quality_0() {
        // given (arrange)
        Item[] items = new Item[]{new Item(BACKSTAGE_PASS, 12, 0)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(11, items[0].sellIn);
        assertEquals(1, items[0].quality);
    }

    @Test
    public void sulfuras_sellin_m2_quality_80() {
        // given (arrange)
        Item[] items = new Item[]{new Item(SULFURAS, -2, 80)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-2, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }

    @Test
    public void agedBrie_sellin_0_quality_50() {
        // given (arrange)
        Item[] items = new Item[]{new Item(AGED_BRIE, 0, 50)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-1, items[0].sellIn);
        assertEquals(50, items[0].quality);
    }

    @Test
    public void normal_item_sellin_m3_quality_10() {
        // given (arrange)
        Item[] items = new Item[]{new Item(NONAME, -3, 10)};
        GildedRose gildedRose = new GildedRose(items);

        // when (act)
        gildedRose.updateQuality();

        // then (assert)
        assertEquals(-4, items[0].sellIn);
        assertEquals(8, items[0].quality);
    }
}