package vn.hunghd.flutterdownloader;

public class DownloadTask {
    int primaryId;
    String taskId;
    int status;
    int progress;
    String url;
    String title;
    String filename;
    long fileSize;
    String savedDir;
    String headers;
    String extras;
    String mimeType;
    boolean resumable;
    boolean showNotification;
    boolean openFileFromNotification;
    long timeCreated;

    DownloadTask(int primaryId, String taskId, int status, int progress, String url, String title, String filename, long fileSize, String savedDir,
                 String headers, String extras, String mimeType, boolean resumable, boolean showNotification, boolean openFileFromNotification, long timeCreated) {
        this.primaryId = primaryId;
        this.taskId = taskId;
        this.status = status;
        this.progress = progress;
        this.url = url;
        this.title = title;
        this.filename = filename;
        this.fileSize = fileSize;
        this.savedDir = savedDir;
        this.headers = headers;
        this.extras = extras;
        this.mimeType = mimeType;
        this.resumable = resumable;
        this.showNotification = showNotification;
        this.openFileFromNotification = openFileFromNotification;
        this.timeCreated = timeCreated;
    }

    @Override
    public String toString() {
        return "DownloadTask{taskId=" + taskId + ",status=" + status + ",progress=" + progress + ",url=" + url + ",title" + title + ",filename=" + filename + ",fileSize=" + fileSize + ",savedDir=" + savedDir + ",headers=" + headers + ",extras=" + extras + "}";
    }
}
