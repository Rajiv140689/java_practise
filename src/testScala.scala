import java.time.LocalDate
import java.time.format.DateTimeFormatter

object testScala {
  def main(args: Array[String]) {
    val dashedDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val eventDate = LocalDate.now().plusDays(1).format(dashedDateFormat)
    println("eventDate: "+eventDate )
    val id = "159ed8f4-750f-44b1-b48a-0f825340782a,f7490ed8-2af2-4077-8955-494bb0a9ec78,e8d44161-52fc-4982-b5ba-924afedc0e04,7251142b-25d3-4c65-b18b-25c27ac03267,328be309-572b-48ce-b669-14d0993e89f6,74af44a7-9453-4bf5-abe3-410a7f86d390,dcf898d1-19a9-401e-b77a-f270f1f32d49,d7baf445-1e4a-46b7-83bc-ed2bf24c47de,32511fa4-7f2f-43a1-b5e7-b669d9874501,ada6a8b1-fc4b-4e92-9ddd-a2d86a8c2bc3,f26e52e0-4285-4a5b-ad82-66d90030feda,a1afe61a-d336-4fb5-873e-c7953faad8b7,243bd76e-60e5-4aa7-b41b-091eefbee7af,cd3db055-8dc3-40ed-a30d-2bbe11107bb1,fd316490-6852-4560-a898-f24e18f12b67,ee9bf7cd-fa77-4d40-9d55-ee33f7d195c4,51bf94ed-facd-43fa-933b-ea54a0cc7fee,8245cb1f-b7bf-4557-8640-2fc58ba5bd7b,0fbd27ec-a120-4266-90e2-a81ab3124977,837bbbdd-9b1e-4256-9547-0be56456ab25,0628fe38-6514-4576-9343-9d0984f8b1b8,a3a17f08-6acb-4116-adf8-e94720262a2e,a714dfa0-3533-4bac-a517-97da47821cf0,5b1039a0-a4d0-4d52-ad5c-856e8607b113,df4ebef4-721c-4f4a-ba7c-b5e852c6bc02,07b8f1d8-8a20-4e88-a579-1963b80b1377,34b66c8e-cee5-4ed9-ae55-7ee0e977bc28,13fd79dd-1e62-4570-938c-9c04f3b95c08,0ff47358-d3b6-4c71-aab5-2298723c663b,1ad24f2b-0edd-4989-9b37-7f589486b309,46eb244e-11d6-4265-a6fa-ca1ae7a6e99b,3cea9257-ac2d-45b4-a63a-8fcb819a092a,c8a304de-662d-49d1-8d62-dfa7d0ec8a73,bfc356a6-726a-4c5b-a7ac-3139dcec5cf8,53f4013b-c8bf-4145-8190-8c3795b3f6b2,4afa1b3f-2dea-4e04-abe2-ab54eb6e0302,a856ce27-e6e9-4483-90aa-17264b7059a5,0faf2732-6c40-4653-b96d-2be7094e4c95,7c6d27ab-b0a0-4558-b21f-9dabdf692e89,2b2d7cf5-9cab-4776-a5ac-cfe644535faa,97defa2c-5e68-4f9b-ae34-bade3f37ed6a,6d838226-0b09-4dbc-8115-87f5461d4171,3fa1429d-fec8-4589-9244-d7b9e2e9c44a,2d186c3d-c118-4565-b4b4-06ea90e016f3,c79ab70a-4cb8-4a5b-9409-f10603d12a1b,621c8a4a-72fb-48f9-90f9-826c4608066a,83f5ed5b-0962-4541-a132-50c300ba99a9"
    val keyIdArray = id.split(",")

    var keyidStr = "";
    val size = keyIdArray.size - 1;
    println("size: " + size)
    for (i <- 0 until size) {
//      println("i: "+i)
//      keyidStr = keyidStr + s"""\"${keyIdArray(i)}\", """
//    }
//    keyidStr = keyidStr + s"""\"${keyIdArray(size)}\" """
      keyidStr = keyidStr + "(lower(key_type) ="+ s"""\"${keyIdArray(i)}\" """ + "and lower(key_id) = " + s"""\"${keyIdArray(i)}\" """ + ") OR "
    }
    keyidStr = keyidStr + "(lower(key_type) ="+ s"""\"${keyIdArray(size)}\" """ + "and lower(key_id) = " + s"""\"${keyIdArray(size)}\" """ + ")"
    println("After keyidStr value: "+ keyidStr)
  }
}
