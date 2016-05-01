/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConstraintSetting extends BulletBase {
	private long swigCPtr;
	
	protected btConstraintSetting(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConstraintSetting, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConstraintSetting(long cPtr, boolean cMemoryOwn) {
		this("btConstraintSetting", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConstraintSetting obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btConstraintSetting(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btConstraintSetting() {
    this(DynamicsJNI.new_btConstraintSetting(), true);
  }

  public void setTau(float value) {
    DynamicsJNI.btConstraintSetting_tau_set(swigCPtr, this, value);
  }

  public float getTau() {
    return DynamicsJNI.btConstraintSetting_tau_get(swigCPtr, this);
  }

  public void setDamping(float value) {
    DynamicsJNI.btConstraintSetting_damping_set(swigCPtr, this, value);
  }

  public float getDamping() {
    return DynamicsJNI.btConstraintSetting_damping_get(swigCPtr, this);
  }

  public void setImpulseClamp(float value) {
    DynamicsJNI.btConstraintSetting_impulseClamp_set(swigCPtr, this, value);
  }

  public float getImpulseClamp() {
    return DynamicsJNI.btConstraintSetting_impulseClamp_get(swigCPtr, this);
  }

}
