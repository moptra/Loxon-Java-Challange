package hu.progmasters.desk;

import net.bytebuddy.asm.Advice;

public class Drawer {
    private boolean isDrawerOpen;
    private Paper paper;

    public Drawer(boolean isDrawerOpen, Paper paper) {
        this.isDrawerOpen = isDrawerOpen;
        this.paper = paper;
    }

    public void setDrawerOpen(boolean drawerOpened) {
        isDrawerOpen = drawerOpened;
    }

    public void fillDrawer(Paper paper) {
        this.paper = paper;
    }

    public void emptyDrawer() {
        this.paper = null;
    }

    public String toString () {
        if (isDrawerOpen == true) {
            if (paper == null) {
                return "drawer is open, but empty.";
            } else {
                return "drawer is open, and there's a paper in it with the following text: " + paper.content + ".";
            }

        } else {
            return "drawer is closed.";
        }
    }
}
