package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class OSObservable<ObserverType, StateType> {
    private boolean fireOnMainThread;
    private String methodName;
    private List<Object> observers;

    OSObservable(String methodName2, boolean fireOnMainThread2) {
        List<Object> list;
        this.methodName = methodName2;
        this.fireOnMainThread = fireOnMainThread2;
        new ArrayList();
        this.observers = list;
    }

    /* access modifiers changed from: package-private */
    public void addObserver(ObserverType observer) {
        Object obj;
        new WeakReference(observer);
        boolean add = this.observers.add(obj);
    }

    /* access modifiers changed from: package-private */
    public void addObserverStrong(ObserverType observer) {
        boolean add = this.observers.add(observer);
    }

    /* access modifiers changed from: package-private */
    public void removeObserver(ObserverType observertype) {
        ObserverType observer = observertype;
        for (int i = 0; i < this.observers.size(); i++) {
            if (((WeakReference) this.observers.get(i)).get().equals(observer)) {
                Object remove = this.observers.remove(i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean notifyChange(StateType statetype) {
        Object strongRefObserver;
        Runnable runnable;
        StateType state = statetype;
        boolean notified = false;
        for (Object observer : this.observers) {
            if (observer instanceof WeakReference) {
                strongRefObserver = ((WeakReference) observer).get();
            } else {
                strongRefObserver = observer;
            }
            if (strongRefObserver != null) {
                try {
                    Method method = strongRefObserver.getClass().getDeclaredMethod(this.methodName, new Class[]{state.getClass()});
                    method.setAccessible(true);
                    if (this.fireOnMainThread) {
                        final Method method2 = method;
                        final Object obj = strongRefObserver;
                        final StateType statetype2 = state;
                        new Runnable(this) {
                            final /* synthetic */ OSObservable this$0;

                            {
                                this.this$0 = this$0;
                            }

                            public void run() {
                                try {
                                    Object invoke = method2.invoke(obj, new Object[]{statetype2});
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        };
                        OSUtils.runOnMainUIThread(runnable);
                    } else {
                        try {
                            Object invoke = method.invoke(strongRefObserver, new Object[]{state});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                    notified = true;
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return notified;
    }
}
