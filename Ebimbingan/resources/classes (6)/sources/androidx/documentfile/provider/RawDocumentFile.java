package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class RawDocumentFile extends DocumentFile {
    private File mFile;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RawDocumentFile(@Nullable DocumentFile parent, File file) {
        super(parent);
        this.mFile = file;
    }

    @Nullable
    public DocumentFile createFile(String mimeType, String str) {
        File file;
        StringBuilder sb;
        DocumentFile documentFile;
        StringBuilder sb2;
        String displayName = str;
        String extension = MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType);
        if (extension != null) {
            new StringBuilder();
            displayName = sb2.append(displayName).append(".").append(extension).toString();
        }
        new File(this.mFile, displayName);
        File target = file;
        try {
            boolean createNewFile = target.createNewFile();
            DocumentFile documentFile2 = documentFile;
            new RawDocumentFile(this, target);
            return documentFile2;
        } catch (IOException e) {
            new StringBuilder();
            int w = Log.w("DocumentFile", sb.append("Failed to createFile: ").append(e).toString());
            return null;
        }
    }

    @Nullable
    public DocumentFile createDirectory(String displayName) {
        File file;
        RawDocumentFile rawDocumentFile;
        new File(this.mFile, displayName);
        File target = file;
        if (!target.isDirectory() && !target.mkdir()) {
            return null;
        }
        new RawDocumentFile(this, target);
        return rawDocumentFile;
    }

    public Uri getUri() {
        return Uri.fromFile(this.mFile);
    }

    public String getName() {
        return this.mFile.getName();
    }

    @Nullable
    public String getType() {
        if (this.mFile.isDirectory()) {
            return null;
        }
        return getTypeForName(this.mFile.getName());
    }

    public boolean isDirectory() {
        return this.mFile.isDirectory();
    }

    public boolean isFile() {
        return this.mFile.isFile();
    }

    public boolean isVirtual() {
        return false;
    }

    public long lastModified() {
        return this.mFile.lastModified();
    }

    public long length() {
        return this.mFile.length();
    }

    public boolean canRead() {
        return this.mFile.canRead();
    }

    public boolean canWrite() {
        return this.mFile.canWrite();
    }

    public boolean delete() {
        boolean deleteContents = deleteContents(this.mFile);
        return this.mFile.delete();
    }

    public boolean exists() {
        return this.mFile.exists();
    }

    public DocumentFile[] listFiles() {
        ArrayList arrayList;
        Object obj;
        new ArrayList();
        ArrayList arrayList2 = arrayList;
        File[] files = this.mFile.listFiles();
        if (files != null) {
            File[] fileArr = files;
            int length = fileArr.length;
            for (int i = 0; i < length; i++) {
                new RawDocumentFile(this, fileArr[i]);
                boolean add = arrayList2.add(obj);
            }
        }
        return (DocumentFile[]) arrayList2.toArray(new DocumentFile[arrayList2.size()]);
    }

    public boolean renameTo(String displayName) {
        File file;
        new File(this.mFile.getParentFile(), displayName);
        File target = file;
        if (!this.mFile.renameTo(target)) {
            return false;
        }
        this.mFile = target;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r0.substring(r1 + 1).toLowerCase());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getTypeForName(java.lang.String r7) {
        /*
            r0 = r7
            r4 = r0
            r5 = 46
            int r4 = r4.lastIndexOf(r5)
            r1 = r4
            r4 = r1
            if (r4 < 0) goto L_0x002a
            r4 = r0
            r5 = r1
            r6 = 1
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r4 = r4.toLowerCase()
            r2 = r4
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            r5 = r2
            java.lang.String r4 = r4.getMimeTypeFromExtension(r5)
            r3 = r4
            r4 = r3
            if (r4 == 0) goto L_0x002a
            r4 = r3
            r0 = r4
        L_0x0029:
            return r0
        L_0x002a:
            java.lang.String r4 = "application/octet-stream"
            r0 = r4
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.documentfile.provider.RawDocumentFile.getTypeForName(java.lang.String):java.lang.String");
    }

    private static boolean deleteContents(File dir) {
        StringBuilder sb;
        File[] files = dir.listFiles();
        boolean success = true;
        if (files != null) {
            File[] fileArr = files;
            int length = fileArr.length;
            for (int i = 0; i < length; i++) {
                File file = fileArr[i];
                if (file.isDirectory()) {
                    success &= deleteContents(file);
                }
                if (!file.delete()) {
                    new StringBuilder();
                    int w = Log.w("DocumentFile", sb.append("Failed to delete ").append(file).toString());
                    success = false;
                }
            }
        }
        return success;
    }
}
