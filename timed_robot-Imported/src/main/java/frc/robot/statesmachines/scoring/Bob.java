package frc.robot.statesmachines.scoring;

import frc.robot.Library.StateMachine.StateMachine;

public class Bob extends StateMachine{
    public static intakeState intakeState = new intakeState();
    public static outtakeState outtakeState = new outtakeState();
    public static idleState idleState = new idleState();

    public Bob() {
        intakeState.build();
        outtakeState.build();
        idleState.build();
    }
}
