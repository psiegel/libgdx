/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
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

public class btGhostPairCallback extends btOverlappingPairCallback {
	private long swigCPtr;
	
	protected btGhostPairCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btGhostPairCallback_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGhostPairCallback, normally you should not need this constructor it's intended for low-level usage. */
	public btGhostPairCallback(long cPtr, boolean cMemoryOwn) {
		this("btGhostPairCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btGhostPairCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btGhostPairCallback obj) {
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
				CollisionJNI.delete_btGhostPairCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.btGhostPairCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.btGhostPairCallback_change_ownership(this, swigCPtr, true);
  }

  public btGhostPairCallback() {
    this(CollisionJNI.new_btGhostPairCallback(), true);
    CollisionJNI.btGhostPairCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public btBroadphasePair addOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
	return btBroadphasePair.internalTemp((getClass() == btGhostPairCallback.class) ? CollisionJNI.btGhostPairCallback_addOverlappingPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1) : CollisionJNI.btGhostPairCallback_addOverlappingPairSwigExplicitbtGhostPairCallback(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1), false);
}

  public long removeOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1, btDispatcher dispatcher) {
    return (getClass() == btGhostPairCallback.class) ? CollisionJNI.btGhostPairCallback_removeOverlappingPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1, btDispatcher.getCPtr(dispatcher), dispatcher) : CollisionJNI.btGhostPairCallback_removeOverlappingPairSwigExplicitbtGhostPairCallback(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void removeOverlappingPairsContainingProxy(btBroadphaseProxy arg0, btDispatcher arg1) {
    if (getClass() == btGhostPairCallback.class) CollisionJNI.btGhostPairCallback_removeOverlappingPairsContainingProxy(swigCPtr, this, btBroadphaseProxy.getCPtr(arg0), arg0, btDispatcher.getCPtr(arg1), arg1); else CollisionJNI.btGhostPairCallback_removeOverlappingPairsContainingProxySwigExplicitbtGhostPairCallback(swigCPtr, this, btBroadphaseProxy.getCPtr(arg0), arg0, btDispatcher.getCPtr(arg1), arg1);
  }

}
