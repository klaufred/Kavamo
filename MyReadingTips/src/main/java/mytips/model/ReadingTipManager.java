/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytips.model;

import java.util.*;
import mytips.IO;

/**
 *
 * @author vseppane
 */
public class ReadingTipManager implements TipManager {

    private ArrayList<ReadingTip> readingTips;
    private IO io;

    public ReadingTipManager(IO io) {
        //Haetaanko lukuvinkit tässä kohtaa tietokannasta?

        readingTips = new ArrayList<>();
        this.io = io;
    }

    @Override
    public void addReadingTip(ReadingTip readingTip) {
        //to do: lukuvinkin lisäys tietokantaan

        this.readingTips.add(readingTip);
    }

    @Override
    public ArrayList<ReadingTip> getReadingTips() {
        return readingTips;
    }

    @Override
    public void printReadingTips() {
        for (ReadingTip tip : readingTips) {
            io.print(tip.toString() + "\n");
        }
    }
}