// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TalonMotor extends SubsystemBase {
  /** Creates a new Motor. */
  public TalonFX motor;
  
  public TalonMotor() {
    // motors
    this.motor = new TalonFX(1);
    this.motor.setNeutralMode(NeutralMode.Brake);
  }

  public void motorPower(Double power) {
    this.motor.set(ControlMode.PercentOutput, power);
  }

  public void motorOn(double power) {
    motor.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
