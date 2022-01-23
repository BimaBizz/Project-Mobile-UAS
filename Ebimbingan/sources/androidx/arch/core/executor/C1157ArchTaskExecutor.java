package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.arch.core.executor.ArchTaskExecutor */
public class C1157ArchTaskExecutor extends C1159TaskExecutor {
    @NonNull
    private static final Executor sIOThreadExecutor;
    private static volatile C1157ArchTaskExecutor sInstance;
    @NonNull
    private static final Executor sMainThreadExecutor;
    @NonNull
    private C1159TaskExecutor mDefaultTaskExecutor;
    @NonNull
    private C1159TaskExecutor mDelegate = this.mDefaultTaskExecutor;

    static {
        Executor executor;
        Executor executor2;
        new Executor() {
            public void execute(Runnable command) {
                C1157ArchTaskExecutor.getInstance().postToMainThread(command);
            }
        };
        sMainThreadExecutor = executor;
        new Executor() {
            public void execute(Runnable command) {
                C1157ArchTaskExecutor.getInstance().executeOnDiskIO(command);
            }
        };
        sIOThreadExecutor = executor2;
    }

    private C1157ArchTaskExecutor() {
        C1159TaskExecutor taskExecutor;
        new C1158DefaultTaskExecutor();
        this.mDefaultTaskExecutor = taskExecutor;
    }

    @NonNull
    public static C1157ArchTaskExecutor getInstance() {
        C1157ArchTaskExecutor archTaskExecutor;
        if (sInstance != null) {
            return sInstance;
        }
        Class<C1157ArchTaskExecutor> cls = C1157ArchTaskExecutor.class;
        Class<C1157ArchTaskExecutor> cls2 = cls;
        synchronized (cls) {
            try {
                if (sInstance == null) {
                    new C1157ArchTaskExecutor();
                    sInstance = archTaskExecutor;
                }
                return sInstance;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Class<C1157ArchTaskExecutor> cls3 = cls2;
                    throw th2;
                }
            }
        }
    }

    public void setDelegate(@Nullable C1159TaskExecutor taskExecutor) {
        C1159TaskExecutor taskExecutor2 = taskExecutor;
        this.mDelegate = taskExecutor2 == null ? this.mDefaultTaskExecutor : taskExecutor2;
    }

    public void executeOnDiskIO(Runnable runnable) {
        this.mDelegate.executeOnDiskIO(runnable);
    }

    public void postToMainThread(Runnable runnable) {
        this.mDelegate.postToMainThread(runnable);
    }

    @NonNull
    public static Executor getMainThreadExecutor() {
        return sMainThreadExecutor;
    }

    @NonNull
    public static Executor getIOThreadExecutor() {
        return sIOThreadExecutor;
    }

    public boolean isMainThread() {
        return this.mDelegate.isMainThread();
    }
}
