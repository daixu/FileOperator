package ando.file.selector

import ando.file.core.FileType

/**
 * Title: FileSelectOptions
 *
 * @author javakam
 * @date 2020/5/21  10:51
 */
class FileSelectOptions {

    var maxCount: Int = Int.MAX_VALUE                  //可选文件最大数量
    var minCountTip: String? = ""
    var maxCountTip: String? = ""

    var fileType: FileType? = null
    var singleFileMaxSize: Long = -1                   //单文件大小控制 Byte
    var singleFileMaxSizeTip: String? = FileSelector.DEFAULT_SINGLE_FILE_SIZE_THRESHOLD
    var allFilesMaxSize: Long = -1                     //总文件大小控制 Byte
    var allFilesMaxSizeTip: String? = FileSelector.DEFAULT_SINGLE_FILE_SIZE_THRESHOLD

    var fileCondition: FileSelectCondition? = null


}