package rp.assignments.team.warehouse.shared;

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
        return values[(ordinal() + 1) % values.length];
    }

    public Facing turnLeft() {
        return values[ordinal() == 0 ? values.length - 1 : ordinal() - 1];
    }
}
