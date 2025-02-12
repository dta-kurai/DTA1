package frc.robot.statesmachines.scoring;

import frc.robot.Robot;
import frc.robot.Library.StateMachine.State;
import frc.robot.Library.StateMachine.Transition;

public class idleState extends State{
    public idleState() {

    }

    @Override
    public void build() {
        addTransition(
            new Transition(() -> {
                return Robot.controller.getAButtonPressed();
            },
            Bob.intakeState)
        );

        addTransition(
            new Transition(() -> {
                return Robot.controller.getBButtonPressed();
            },
            Bob.outtakeState)
        );
    }

    @Override
    public void init(State prevState) {
        Robot.intakeMotor.set(0);
    }

    @Override
    public void execute() {

    }

    @Override
    public void exit(State nextState) {

    }
}
