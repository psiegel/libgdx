/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConvexCast extends BulletBase {
	private long swigCPtr;
	
	protected btConvexCast(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexCast, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConvexCast(long cPtr, boolean cMemoryOwn) {
		this("btConvexCast", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConvexCast obj) {
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
				CollisionJNI.delete_btConvexCast(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class CastResult extends BulletBase {
  	private long swigCPtr;
  	
  	protected CastResult(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CastResult, normally you should not need this constructor it's intended for low-level usage. */ 
  	public CastResult(long cPtr, boolean cMemoryOwn) {
  		this("CastResult", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(CastResult obj) {
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
  				CollisionJNI.delete_btConvexCast_CastResult(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void DebugDraw(float fraction) {
      CollisionJNI.btConvexCast_CastResult_DebugDraw(swigCPtr, this, fraction);
    }
  
    public void drawCoordSystem(Matrix4 trans) {
      CollisionJNI.btConvexCast_CastResult_drawCoordSystem(swigCPtr, this, trans);
    }
  
    public void reportFailure(int errNo, int numIterations) {
      CollisionJNI.btConvexCast_CastResult_reportFailure(swigCPtr, this, errNo, numIterations);
    }
  
    public CastResult() {
      this(CollisionJNI.new_btConvexCast_CastResult(), true);
    }
  
    public void setHitTransformA(btTransform value) {
      CollisionJNI.btConvexCast_CastResult_hitTransformA_set(swigCPtr, this, btTransform.getCPtr(value), value);
    }
  
    public btTransform getHitTransformA() {
      long cPtr = CollisionJNI.btConvexCast_CastResult_hitTransformA_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btTransform(cPtr, false);
    }
  
    public void setHitTransformB(btTransform value) {
      CollisionJNI.btConvexCast_CastResult_hitTransformB_set(swigCPtr, this, btTransform.getCPtr(value), value);
    }
  
    public btTransform getHitTransformB() {
      long cPtr = CollisionJNI.btConvexCast_CastResult_hitTransformB_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btTransform(cPtr, false);
    }
  
    public void setNormal(btVector3 value) {
      CollisionJNI.btConvexCast_CastResult_normal_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getNormal() {
      long cPtr = CollisionJNI.btConvexCast_CastResult_normal_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setHitPoint(btVector3 value) {
      CollisionJNI.btConvexCast_CastResult_hitPoint_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getHitPoint() {
      long cPtr = CollisionJNI.btConvexCast_CastResult_hitPoint_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setFraction(float value) {
      CollisionJNI.btConvexCast_CastResult_fraction_set(swigCPtr, this, value);
    }
  
    public float getFraction() {
      return CollisionJNI.btConvexCast_CastResult_fraction_get(swigCPtr, this);
    }
  
    public void setDebugDrawer(btIDebugDraw value) {
      CollisionJNI.btConvexCast_CastResult_debugDrawer_set(swigCPtr, this, btIDebugDraw.getCPtr(value), value);
    }
  
    public btIDebugDraw getDebugDrawer() {
      long cPtr = CollisionJNI.btConvexCast_CastResult_debugDrawer_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btIDebugDraw(cPtr, false);
    }
  
    public void setAllowedPenetration(float value) {
      CollisionJNI.btConvexCast_CastResult_allowedPenetration_set(swigCPtr, this, value);
    }
  
    public float getAllowedPenetration() {
      return CollisionJNI.btConvexCast_CastResult_allowedPenetration_get(swigCPtr, this);
    }
  
  }

  public boolean calcTimeOfImpact(Matrix4 fromA, Matrix4 toA, Matrix4 fromB, Matrix4 toB, btConvexCast.CastResult result) {
    return CollisionJNI.btConvexCast_calcTimeOfImpact(swigCPtr, this, fromA, toA, fromB, toB, btConvexCast.CastResult.getCPtr(result), result);
  }

}
