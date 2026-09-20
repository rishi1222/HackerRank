package DataStructures.Collections.Map;
/*
* Java Tree Map implements a red-black tree it is a kind of self-balancing binary search tree . Each node of the binary tree
* has an extra bit, and that bit is often interpreted as the color (red or black) of the node. These color bits are used too ensure
* the tree remains approximately balanced during insertion and deletion.
*
* Balance is preserved by painting each node of the tree with one or two colors in a way that satisfies the certain properties
* which is collective constrain how unbalanced the tree can become in the wort case . When the tree is modified the new tree is
* subsequently rearranged and repainted to restore the coloring properties. The properties is designed in such a way that this
* rearranging and recoloring can be performed efficiently.
*
* The balancing of the tree is not perfect but it is good enough to allow it to guarantee searching in O(log n) time, where n
* is the total number of elements in the tree. The insertion and deletion operations along with the tree rearrangement and the
* and recoloring are also performed in O(log n) time.
*
* Tracking the color of each node requires only 1 bit of information per node because there are only two colors. The tree does
* not contain any other data specific to its being red-black tree so its memory footprint is almost identical to a classic
* binary search tree. I many cases , the additional bit can be added at no additional memory cost.
*
*
* HashMap Vs TreeMap
*
* HashMap preserves the order of insertion were as TreeMap is sorted in ascending order of the key.
* */
public class TreeMap {
}
