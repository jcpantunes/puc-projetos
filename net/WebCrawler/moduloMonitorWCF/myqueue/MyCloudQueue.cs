using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace moduloMonitorWCF.myqueue
{
    class MyCloudQueue
    {
        //private CloudStorageAccount storageAccount;
        //private CloudQueue queue;
        //public ControleQueue()
        //{
        //    //        CloudStorageAccount storageAccount = CloudStorageAccount.Parse(
        //    //CloudConfigurationManager.GetSetting("StorageConnectionString"));
        //    //        storageAccount = CloudStorageAccount.Parse(
        //    //ConfigurationManager.ConnectionStrings["StorageConnectionString"].ConnectionString);

        //    storageAccount = CloudStorageAccount.DevelopmentStorageAccount;
        //    CloudQueueClient queueClient = storageAccount.CreateCloudQueueClient();
            
        //    // Retrieve a reference to a queue
        //    queue = queueClient.GetQueueReference("myqueue");

        //    // Create the queue if it doesn't already exist
        //    queue.CreateIfNotExist();
        //}

        //public void InsertQueue(string msg)
        //{            
        //    // Create a message and add it to the queue.
        //    CloudQueueMessage message = new CloudQueueMessage(msg);
        //    queue.AddMessage(message);
        //}

        //public string ReadNextMensage()
        //{
        //    // Peek at the next message
        //    CloudQueueMessage queueMessage = queue.GetMessage();
        //    if (queueMessage == null)
        //        return null;
           
        //   var msg  = queueMessage.AsString;
        //   queue.DeleteMessage(queueMessage);
        //   return msg;
        //}
    }
}
