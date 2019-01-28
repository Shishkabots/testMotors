/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;


/**
 * 
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class motors extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static double speed = 0.2;
  public static WPI_VictorSPX lv = Robot.leftVictor;
  public static WPI_VictorSPX rv = Robot.rightVictor;
  public static WPI_TalonSRX lt = Robot.leftTalon;
  public static WPI_TalonSRX rt = Robot.rightTalon;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    rt.set(ControlMode.PercentOutput, speed);
    lt.set(ControlMode.PercentOutput, speed);
    lv.set(ControlMode.PercentOutput, speed);
    rv.set(ControlMode.PercentOutput, speed);
  }

  public void fast() {
    speed += -0.02;
    rt.set(ControlMode.PercentOutput, speed);
    lt.set(ControlMode.PercentOutput, speed);
    lv.set(ControlMode.PercentOutput, speed);
    rv.set(ControlMode.PercentOutput, speed);
  }
  public void slow() {
    speed += 0.02;
    rt.set(ControlMode.PercentOutput, speed);
    lt.set(ControlMode.PercentOutput, speed);
    lv.set(ControlMode.PercentOutput, speed);
    rv.set(ControlMode.PercentOutput, speed);
  }
}
