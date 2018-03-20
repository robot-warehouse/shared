package rp.assignments.team.warehouse.shared;

import rp.assignments.team.warehouse.shared.communications.Command;

public enum Facing {
    /**
     * Positive in the y-axis, facing away from the lab door
     */
    NORTH,

    /**
     * Positive in the x-axis
     */
    EAST,

    /**
     * Negative in the y-axis, facing towards the lab door
     */
    SOUTH,

    /**
     * Negative in the x-axis
     */
    WEST;

    private static Facing[] values = values();

    public Facing turnRight() {
        return this.values[(ordinal() + 1) % this.values.length];
    }

    public Facing turnLeft() {
        return this.values[ordinal() == 0 ? this.values.length - 1 : ordinal() - 1];
    }
    
    public static Facing strToFacing(String s) throws NullPointerException, IllegalArgumentException {
        for (Facing f : Facing.values()) {
            if (f.toString().equals(s)) {
                return f;
            }
        }

        throw new IllegalArgumentException("Not a value of this enum");
    }
}
